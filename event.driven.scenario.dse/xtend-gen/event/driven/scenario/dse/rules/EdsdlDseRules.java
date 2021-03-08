package event.driven.scenario.dse.rules;

import event.driven.scenario.dl.edsdl.State;
import event.driven.scenario.dse.queries.GetCurrentState;
import java.util.function.Consumer;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class EdsdlDseRules {
  @Extension
  private BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory();
  
  public BatchTransformationRule<?, ?> currentState;
  
  public EdsdlDseRules() {
    try {
      final Consumer<GetCurrentState.Match> _function = (GetCurrentState.Match it) -> {
        InputOutput.<State>println(it.getActualState());
      };
      this.currentState = this.factory.<GetCurrentState.Match, GetCurrentState.Matcher>createRule().name("getCurrentState").precondition(GetCurrentState.instance()).action(_function).build();
    } catch (final Throwable _t) {
      if (_t instanceof ViatraQueryException) {
        final ViatraQueryException e = (ViatraQueryException)_t;
        throw new DSEException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
