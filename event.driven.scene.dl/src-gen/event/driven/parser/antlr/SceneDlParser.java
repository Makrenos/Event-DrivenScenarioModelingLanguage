/*
 * generated by Xtext 2.25.0
 */
package event.driven.parser.antlr;

import com.google.inject.Inject;
import event.driven.parser.antlr.internal.InternalSceneDlParser;
import event.driven.services.SceneDlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SceneDlParser extends AbstractAntlrParser {

	@Inject
	private SceneDlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSceneDlParser createParser(XtextTokenStream stream) {
		return new InternalSceneDlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Scene";
	}

	public SceneDlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SceneDlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}