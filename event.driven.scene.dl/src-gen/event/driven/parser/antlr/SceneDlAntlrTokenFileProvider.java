/*
 * generated by Xtext 2.25.0
 */
package event.driven.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SceneDlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("event/driven/parser/antlr/internal/InternalSceneDl.tokens");
	}
}