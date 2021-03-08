package event.driven.scenario.dse.rules

import org.eclipse.viatra.dse.api.DSEException
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import event.driven.scenario.dse.queries.GetCurrentState

class EdsdlDseRules {
    extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
    
    public BatchTransformationRule<?, ?> currentState

    new() {
        try {
            currentState = createRule
                .name("getCurrentState")
                .precondition(GetCurrentState.instance())
                .action[                	                	            	
                	println(actualState)    
                ]
                .build

        } catch (ViatraQueryException e) {
            throw new DSEException(e)
        }

    }
	
}
