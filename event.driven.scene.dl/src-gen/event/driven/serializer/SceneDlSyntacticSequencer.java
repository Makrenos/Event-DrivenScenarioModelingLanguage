/*
 * generated by Xtext 2.25.0
 */
package event.driven.serializer;

import com.google.inject.Inject;
import event.driven.services.SceneDlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SceneDlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SceneDlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_RegularAttribute_LeftSquareBracketKeyword_3_q;
	protected AbstractElementAlias match_RegularAttribute_RightSquareBracketKeyword_6_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SceneDlGrammarAccess) access;
		match_RegularAttribute_LeftSquareBracketKeyword_3_q = new TokenAlias(false, true, grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3());
		match_RegularAttribute_RightSquareBracketKeyword_6_q = new TokenAlias(false, true, grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_RegularAttribute_LeftSquareBracketKeyword_3_q.equals(syntax))
				emit_RegularAttribute_LeftSquareBracketKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RegularAttribute_RightSquareBracketKeyword_6_q.equals(syntax))
				emit_RegularAttribute_RightSquareBracketKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '['?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=AttributeType (ambiguity) value+=AttributeValue
	 */
	protected void emit_RegularAttribute_LeftSquareBracketKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ']'?
	 *
	 * This ambiguous syntax occurs at:
	 *     value+=AttributeValue (ambiguity) (rule end)
	 *     value+=AttributeValue (ambiguity) isTransient?='transient'
	 */
	protected void emit_RegularAttribute_RightSquareBracketKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}