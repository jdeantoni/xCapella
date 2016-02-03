import 'http://www.polarsys.org/capella/core/modeller/0.8.0'
import 'http://www.polarsys.org/kitalpha/emde/1.0.0'
import 'platform:/resource/com.thalesgroup.trt.mde.vp.modesimulation/models/ModeSimulation.ecore'
import 'http://www.polarsys.org/capella/core/fa/0.8.0' 

import 'http://www.polarsys.org/capella/core/core/0.8.0'
import 'http://www.polarsys.org/capella/core/common/0.8.0'
import 'http://www.eclipse.org/emf/2002/Ecore'



ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib" 
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 
ECLimport "platform:/resource/fr.inria.aoste.dataflowmode.constraint.moccml/mocc/ModeFunctionalChain.moccml"

package capellamodeller

endpackage

package emde

endpackage

package ModeSimulation 
      
endpackage  

package fa


context FunctionalChain
	def : activate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().activate()
	def : deactivate : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionalChainRuntimeData)).oclAsType(ModeSimulation::FunctionalChainRuntimeData)->first().deactivate()
	def : anyFunctionStart: Event = self
	
	inv activateFunctionsWhenActivated:
		Relation Coincides (self.activate, self.enactedFunctions.makeactive)
	inv unActivateFunctionsWhenDeactivated:
		Relation Coincides (self.deactivate, self.enactedFunctions.makeinactive)
		
	inv anyFunctionSettings:
		let anyStart: Event = Expression Union(self.enactedFunctions.start) in
		Relation Coincides(anyFunctionStart, anyStart)
	
	inv functionsStartOnlyWhenActive:
		Relation NoFunctionalChainIfNotAvailableInMode(self.activate, self.deactivate, self.anyFunctionStart)
	


context AbstractFunction
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().activate()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : start : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().start()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : run : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().run()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : stop : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().stop()
	def if (self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction))) : makeinactive : Event = self.ownedExtensions->select(E | (E).oclIsTypeOf(ModeSimulation::FunctionRuntimeData)).oclAsType(ModeSimulation::FunctionRuntimeData)->first().deactivate()


--	def : compute : Event = self.compute()
--	def : update : Event = self.update()
	
--	def : isSequential : Integer = 0

	inv ActivateOnlyOnce :
		(self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
		implies 
	  	(let firstInit : Event = Expression OneTickAndNoMore(makeactive) in
	  	Relation Coincides(self.makeactive, firstInit))
	  
	inv ActivateSonWithFather :
		(self.ownedFunctions->notEmpty()) implies
		(Relation Coincides(self.makeactive,self.ownedFunctions->first().makeactive))
	  
	inv ActivateAllSonTogether :
		(self.ownedFunctions->notEmpty()) implies
		(Relation Coincides(self.ownedFunctions.makeactive))
	  
	 inv ActivatePrecedesStart :
	 	(self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
		implies
	 	(Relation Precedes(self.makeactive,self.start))
	 	
	 inv StartPrecedesRun :
	 	(self.ownedFunctions->notEmpty() 
			or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
		implies
	 	(Relation Precedes(self.start,self.run))

	inv AlternateActiveAndInactive:
		(self.ownedFunctions->notEmpty() 
				or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
		implies
	  	(Relation Alternates(self.makeactive,self.makeinactive))
	
	inv AlternateStartAndStop:
		(self.ownedFunctions->notEmpty() 
				or (self.oclAsType(ecore::EObject).eContainer().oclIsKindOf(AbstractFunction)))
		implies
	  	(Relation Alternates(self.start,self.stop))
	 
	  
	inv StartFatherBeforeSon:
		(self.ownedFunctions->notEmpty()) implies
		(let firstSonStart : Event = Expression Inf(self.ownedFunctions.start) in
			Relation Precedes(self.start,firstSonStart))
		
	inv StopSonBeforeFather:
		(self.ownedFunctions->notEmpty()) implies
		(let lastSonFinish: Event = Expression Sup(self.ownedFunctions.stop) in
			Relation Precedes(lastSonFinish,self.stop))

context FunctionalExchange

--	def : sourceFunction : AbstractFunction =
--		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)
		
--	def : targetFunction : AbstractFunction =
--		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction)

	inv SourcePrecedesTarget:
	(let sourceFunction : AbstractFunction =
		self.sourceFunctionOutputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
	let targetFunction : AbstractFunction =
		self.targetFunctionInputPort.oclAsType(ecore::EObject).eContainer().oclAsType(AbstractFunction) in
          	(Relation Precedes((sourceFunction).makeinactive,(targetFunction).makeactive)))
          	

endpackage