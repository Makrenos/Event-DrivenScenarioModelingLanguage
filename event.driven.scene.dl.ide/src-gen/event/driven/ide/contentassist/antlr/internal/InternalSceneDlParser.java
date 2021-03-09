package event.driven.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import event.driven.services.SceneDlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSceneDlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'range'", "'value'", "'key'", "'isA'", "'{'", "'}'", "','", "':'", "'['", "']'", "'-'", "';'", "'.'", "'static_entity'", "'dynamic_entity'", "'many'", "'transient'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSceneDlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSceneDlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSceneDlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSceneDl.g"; }


    	private SceneDlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SceneDlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleScene"
    // InternalSceneDl.g:53:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalSceneDl.g:54:1: ( ruleScene EOF )
            // InternalSceneDl.g:55:1: ruleScene EOF
            {
             before(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getSceneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalSceneDl.g:62:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:66:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalSceneDl.g:67:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalSceneDl.g:67:2: ( ( rule__Scene__Group__0 ) )
            // InternalSceneDl.g:68:3: ( rule__Scene__Group__0 )
            {
             before(grammarAccess.getSceneAccess().getGroup()); 
            // InternalSceneDl.g:69:3: ( rule__Scene__Group__0 )
            // InternalSceneDl.g:69:4: rule__Scene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleElement"
    // InternalSceneDl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSceneDl.g:79:1: ( ruleElement EOF )
            // InternalSceneDl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSceneDl.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalSceneDl.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalSceneDl.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalSceneDl.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalSceneDl.g:94:3: ( rule__Element__Alternatives )
            // InternalSceneDl.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleStaticEntity"
    // InternalSceneDl.g:103:1: entryRuleStaticEntity : ruleStaticEntity EOF ;
    public final void entryRuleStaticEntity() throws RecognitionException {
        try {
            // InternalSceneDl.g:104:1: ( ruleStaticEntity EOF )
            // InternalSceneDl.g:105:1: ruleStaticEntity EOF
            {
             before(grammarAccess.getStaticEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticEntity();

            state._fsp--;

             after(grammarAccess.getStaticEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticEntity"


    // $ANTLR start "ruleStaticEntity"
    // InternalSceneDl.g:112:1: ruleStaticEntity : ( ( rule__StaticEntity__Group__0 ) ) ;
    public final void ruleStaticEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:116:2: ( ( ( rule__StaticEntity__Group__0 ) ) )
            // InternalSceneDl.g:117:2: ( ( rule__StaticEntity__Group__0 ) )
            {
            // InternalSceneDl.g:117:2: ( ( rule__StaticEntity__Group__0 ) )
            // InternalSceneDl.g:118:3: ( rule__StaticEntity__Group__0 )
            {
             before(grammarAccess.getStaticEntityAccess().getGroup()); 
            // InternalSceneDl.g:119:3: ( rule__StaticEntity__Group__0 )
            // InternalSceneDl.g:119:4: rule__StaticEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticEntity"


    // $ANTLR start "entryRuleDynamicEntity"
    // InternalSceneDl.g:128:1: entryRuleDynamicEntity : ruleDynamicEntity EOF ;
    public final void entryRuleDynamicEntity() throws RecognitionException {
        try {
            // InternalSceneDl.g:129:1: ( ruleDynamicEntity EOF )
            // InternalSceneDl.g:130:1: ruleDynamicEntity EOF
            {
             before(grammarAccess.getDynamicEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamicEntity();

            state._fsp--;

             after(grammarAccess.getDynamicEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamicEntity"


    // $ANTLR start "ruleDynamicEntity"
    // InternalSceneDl.g:137:1: ruleDynamicEntity : ( ( rule__DynamicEntity__Group__0 ) ) ;
    public final void ruleDynamicEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:141:2: ( ( ( rule__DynamicEntity__Group__0 ) ) )
            // InternalSceneDl.g:142:2: ( ( rule__DynamicEntity__Group__0 ) )
            {
            // InternalSceneDl.g:142:2: ( ( rule__DynamicEntity__Group__0 ) )
            // InternalSceneDl.g:143:3: ( rule__DynamicEntity__Group__0 )
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup()); 
            // InternalSceneDl.g:144:3: ( rule__DynamicEntity__Group__0 )
            // InternalSceneDl.g:144:4: rule__DynamicEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamicEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalSceneDl.g:153:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalSceneDl.g:154:1: ( ruleFeature EOF )
            // InternalSceneDl.g:155:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSceneDl.g:162:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:166:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalSceneDl.g:167:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalSceneDl.g:167:2: ( ( rule__Feature__Group__0 ) )
            // InternalSceneDl.g:168:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalSceneDl.g:169:3: ( rule__Feature__Group__0 )
            // InternalSceneDl.g:169:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleContain"
    // InternalSceneDl.g:178:1: entryRuleContain : ruleContain EOF ;
    public final void entryRuleContain() throws RecognitionException {
        try {
            // InternalSceneDl.g:179:1: ( ruleContain EOF )
            // InternalSceneDl.g:180:1: ruleContain EOF
            {
             before(grammarAccess.getContainRule()); 
            pushFollow(FOLLOW_1);
            ruleContain();

            state._fsp--;

             after(grammarAccess.getContainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContain"


    // $ANTLR start "ruleContain"
    // InternalSceneDl.g:187:1: ruleContain : ( ( rule__Contain__Group__0 ) ) ;
    public final void ruleContain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:191:2: ( ( ( rule__Contain__Group__0 ) ) )
            // InternalSceneDl.g:192:2: ( ( rule__Contain__Group__0 ) )
            {
            // InternalSceneDl.g:192:2: ( ( rule__Contain__Group__0 ) )
            // InternalSceneDl.g:193:3: ( rule__Contain__Group__0 )
            {
             before(grammarAccess.getContainAccess().getGroup()); 
            // InternalSceneDl.g:194:3: ( rule__Contain__Group__0 )
            // InternalSceneDl.g:194:4: rule__Contain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContain"


    // $ANTLR start "entryRuleAttribute"
    // InternalSceneDl.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:204:1: ( ruleAttribute EOF )
            // InternalSceneDl.g:205:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSceneDl.g:212:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:216:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalSceneDl.g:217:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalSceneDl.g:217:2: ( ( rule__Attribute__Alternatives ) )
            // InternalSceneDl.g:218:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalSceneDl.g:219:3: ( rule__Attribute__Alternatives )
            // InternalSceneDl.g:219:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRegularAttribute"
    // InternalSceneDl.g:228:1: entryRuleRegularAttribute : ruleRegularAttribute EOF ;
    public final void entryRuleRegularAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:229:1: ( ruleRegularAttribute EOF )
            // InternalSceneDl.g:230:1: ruleRegularAttribute EOF
            {
             before(grammarAccess.getRegularAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularAttribute();

            state._fsp--;

             after(grammarAccess.getRegularAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularAttribute"


    // $ANTLR start "ruleRegularAttribute"
    // InternalSceneDl.g:237:1: ruleRegularAttribute : ( ( rule__RegularAttribute__Group__0 ) ) ;
    public final void ruleRegularAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:241:2: ( ( ( rule__RegularAttribute__Group__0 ) ) )
            // InternalSceneDl.g:242:2: ( ( rule__RegularAttribute__Group__0 ) )
            {
            // InternalSceneDl.g:242:2: ( ( rule__RegularAttribute__Group__0 ) )
            // InternalSceneDl.g:243:3: ( rule__RegularAttribute__Group__0 )
            {
             before(grammarAccess.getRegularAttributeAccess().getGroup()); 
            // InternalSceneDl.g:244:3: ( rule__RegularAttribute__Group__0 )
            // InternalSceneDl.g:244:4: rule__RegularAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularAttribute"


    // $ANTLR start "entryRulePositionAttribute"
    // InternalSceneDl.g:253:1: entryRulePositionAttribute : rulePositionAttribute EOF ;
    public final void entryRulePositionAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:254:1: ( rulePositionAttribute EOF )
            // InternalSceneDl.g:255:1: rulePositionAttribute EOF
            {
             before(grammarAccess.getPositionAttributeRule()); 
            pushFollow(FOLLOW_1);
            rulePositionAttribute();

            state._fsp--;

             after(grammarAccess.getPositionAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositionAttribute"


    // $ANTLR start "rulePositionAttribute"
    // InternalSceneDl.g:262:1: rulePositionAttribute : ( ( rule__PositionAttribute__Group__0 ) ) ;
    public final void rulePositionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:266:2: ( ( ( rule__PositionAttribute__Group__0 ) ) )
            // InternalSceneDl.g:267:2: ( ( rule__PositionAttribute__Group__0 ) )
            {
            // InternalSceneDl.g:267:2: ( ( rule__PositionAttribute__Group__0 ) )
            // InternalSceneDl.g:268:3: ( rule__PositionAttribute__Group__0 )
            {
             before(grammarAccess.getPositionAttributeAccess().getGroup()); 
            // InternalSceneDl.g:269:3: ( rule__PositionAttribute__Group__0 )
            // InternalSceneDl.g:269:4: rule__PositionAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalSceneDl.g:278:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalSceneDl.g:279:1: ( ruleAttributeValue EOF )
            // InternalSceneDl.g:280:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalSceneDl.g:287:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:291:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalSceneDl.g:292:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalSceneDl.g:292:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalSceneDl.g:293:3: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // InternalSceneDl.g:294:3: ( rule__AttributeValue__Alternatives )
            // InternalSceneDl.g:294:4: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "ruleAttributeType"
    // InternalSceneDl.g:303:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:307:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalSceneDl.g:308:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalSceneDl.g:308:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalSceneDl.g:309:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalSceneDl.g:310:3: ( rule__AttributeType__Alternatives )
            // InternalSceneDl.g:310:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalSceneDl.g:318:1: rule__Element__Alternatives : ( ( ruleStaticEntity ) | ( ruleDynamicEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:322:1: ( ( ruleStaticEntity ) | ( ruleDynamicEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSceneDl.g:323:2: ( ruleStaticEntity )
                    {
                    // InternalSceneDl.g:323:2: ( ruleStaticEntity )
                    // InternalSceneDl.g:324:3: ruleStaticEntity
                    {
                     before(grammarAccess.getElementAccess().getStaticEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStaticEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getStaticEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:329:2: ( ruleDynamicEntity )
                    {
                    // InternalSceneDl.g:329:2: ( ruleDynamicEntity )
                    // InternalSceneDl.g:330:3: ruleDynamicEntity
                    {
                     before(grammarAccess.getElementAccess().getDynamicEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDynamicEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDynamicEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__StaticEntity__Alternatives_4_1"
    // InternalSceneDl.g:339:1: rule__StaticEntity__Alternatives_4_1 : ( ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) ) );
    public final void rule__StaticEntity__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:343:1: ( ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    int LA2_3 = input.LA(3);

                    if ( ((LA2_3>=11 && LA2_3<=12)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==RULE_ID) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSceneDl.g:344:2: ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) )
                    {
                    // InternalSceneDl.g:344:2: ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) )
                    // InternalSceneDl.g:345:3: ( rule__StaticEntity__AttributesAssignment_4_1_0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_1_0()); 
                    // InternalSceneDl.g:346:3: ( rule__StaticEntity__AttributesAssignment_4_1_0 )
                    // InternalSceneDl.g:346:4: rule__StaticEntity__AttributesAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__AttributesAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:350:2: ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) )
                    {
                    // InternalSceneDl.g:350:2: ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) )
                    // InternalSceneDl.g:351:3: ( rule__StaticEntity__FeaturesAssignment_4_1_1 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_1_1()); 
                    // InternalSceneDl.g:352:3: ( rule__StaticEntity__FeaturesAssignment_4_1_1 )
                    // InternalSceneDl.g:352:4: rule__StaticEntity__FeaturesAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__FeaturesAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Alternatives_4_1"


    // $ANTLR start "rule__StaticEntity__Alternatives_4_2"
    // InternalSceneDl.g:360:1: rule__StaticEntity__Alternatives_4_2 : ( ( ( rule__StaticEntity__Group_4_2_0__0 ) ) | ( ( rule__StaticEntity__Group_4_2_1__0 ) ) );
    public final void rule__StaticEntity__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:364:1: ( ( ( rule__StaticEntity__Group_4_2_0__0 ) ) | ( ( rule__StaticEntity__Group_4_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==26) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==18) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==RULE_ID) ) {
                            alt3=2;
                        }
                        else if ( ((LA3_4>=11 && LA3_4<=12)) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSceneDl.g:365:2: ( ( rule__StaticEntity__Group_4_2_0__0 ) )
                    {
                    // InternalSceneDl.g:365:2: ( ( rule__StaticEntity__Group_4_2_0__0 ) )
                    // InternalSceneDl.g:366:3: ( rule__StaticEntity__Group_4_2_0__0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getGroup_4_2_0()); 
                    // InternalSceneDl.g:367:3: ( rule__StaticEntity__Group_4_2_0__0 )
                    // InternalSceneDl.g:367:4: rule__StaticEntity__Group_4_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__Group_4_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStaticEntityAccess().getGroup_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:371:2: ( ( rule__StaticEntity__Group_4_2_1__0 ) )
                    {
                    // InternalSceneDl.g:371:2: ( ( rule__StaticEntity__Group_4_2_1__0 ) )
                    // InternalSceneDl.g:372:3: ( rule__StaticEntity__Group_4_2_1__0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getGroup_4_2_1()); 
                    // InternalSceneDl.g:373:3: ( rule__StaticEntity__Group_4_2_1__0 )
                    // InternalSceneDl.g:373:4: rule__StaticEntity__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__Group_4_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStaticEntityAccess().getGroup_4_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Alternatives_4_2"


    // $ANTLR start "rule__DynamicEntity__Alternatives_4_1"
    // InternalSceneDl.g:381:1: rule__DynamicEntity__Alternatives_4_1 : ( ( ( rule__DynamicEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__DynamicEntity__ContainsAssignment_4_1_1 ) ) );
    public final void rule__DynamicEntity__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:385:1: ( ( ( rule__DynamicEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__DynamicEntity__ContainsAssignment_4_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==RULE_ID) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_3>=11 && LA4_3<=12)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSceneDl.g:386:2: ( ( rule__DynamicEntity__AttributesAssignment_4_1_0 ) )
                    {
                    // InternalSceneDl.g:386:2: ( ( rule__DynamicEntity__AttributesAssignment_4_1_0 ) )
                    // InternalSceneDl.g:387:3: ( rule__DynamicEntity__AttributesAssignment_4_1_0 )
                    {
                     before(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_1_0()); 
                    // InternalSceneDl.g:388:3: ( rule__DynamicEntity__AttributesAssignment_4_1_0 )
                    // InternalSceneDl.g:388:4: rule__DynamicEntity__AttributesAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__AttributesAssignment_4_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:392:2: ( ( rule__DynamicEntity__ContainsAssignment_4_1_1 ) )
                    {
                    // InternalSceneDl.g:392:2: ( ( rule__DynamicEntity__ContainsAssignment_4_1_1 ) )
                    // InternalSceneDl.g:393:3: ( rule__DynamicEntity__ContainsAssignment_4_1_1 )
                    {
                     before(grammarAccess.getDynamicEntityAccess().getContainsAssignment_4_1_1()); 
                    // InternalSceneDl.g:394:3: ( rule__DynamicEntity__ContainsAssignment_4_1_1 )
                    // InternalSceneDl.g:394:4: rule__DynamicEntity__ContainsAssignment_4_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__ContainsAssignment_4_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicEntityAccess().getContainsAssignment_4_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Alternatives_4_1"


    // $ANTLR start "rule__DynamicEntity__Alternatives_4_2"
    // InternalSceneDl.g:402:1: rule__DynamicEntity__Alternatives_4_2 : ( ( ( rule__DynamicEntity__Group_4_2_0__0 ) ) | ( ( rule__DynamicEntity__Group_4_2_1__0 ) ) );
    public final void rule__DynamicEntity__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:406:1: ( ( ( rule__DynamicEntity__Group_4_2_0__0 ) ) | ( ( rule__DynamicEntity__Group_4_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==18) ) {
                        int LA5_4 = input.LA(4);

                        if ( ((LA5_4>=11 && LA5_4<=12)) ) {
                            alt5=1;
                        }
                        else if ( (LA5_4==RULE_ID) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSceneDl.g:407:2: ( ( rule__DynamicEntity__Group_4_2_0__0 ) )
                    {
                    // InternalSceneDl.g:407:2: ( ( rule__DynamicEntity__Group_4_2_0__0 ) )
                    // InternalSceneDl.g:408:3: ( rule__DynamicEntity__Group_4_2_0__0 )
                    {
                     before(grammarAccess.getDynamicEntityAccess().getGroup_4_2_0()); 
                    // InternalSceneDl.g:409:3: ( rule__DynamicEntity__Group_4_2_0__0 )
                    // InternalSceneDl.g:409:4: rule__DynamicEntity__Group_4_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__Group_4_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicEntityAccess().getGroup_4_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:413:2: ( ( rule__DynamicEntity__Group_4_2_1__0 ) )
                    {
                    // InternalSceneDl.g:413:2: ( ( rule__DynamicEntity__Group_4_2_1__0 ) )
                    // InternalSceneDl.g:414:3: ( rule__DynamicEntity__Group_4_2_1__0 )
                    {
                     before(grammarAccess.getDynamicEntityAccess().getGroup_4_2_1()); 
                    // InternalSceneDl.g:415:3: ( rule__DynamicEntity__Group_4_2_1__0 )
                    // InternalSceneDl.g:415:4: rule__DynamicEntity__Group_4_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__Group_4_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicEntityAccess().getGroup_4_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Alternatives_4_2"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalSceneDl.g:423:1: rule__Attribute__Alternatives : ( ( ruleRegularAttribute ) | ( rulePositionAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:427:1: ( ( ruleRegularAttribute ) | ( rulePositionAttribute ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==11) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==19) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==RULE_INT) ) {
                                int LA6_7 = input.LA(6);

                                if ( (LA6_7==EOF||(LA6_7>=16 && LA6_7<=17)||(LA6_7>=20 && LA6_7<=21)||LA6_7==23||LA6_7==27) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_7==22) ) {
                                    alt6=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA6_5==RULE_STRING) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA6_3>=RULE_INT && LA6_3<=RULE_STRING)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_2==12) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==19) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==RULE_INT) ) {
                                int LA6_7 = input.LA(6);

                                if ( (LA6_7==EOF||(LA6_7>=16 && LA6_7<=17)||(LA6_7>=20 && LA6_7<=21)||LA6_7==23||LA6_7==27) ) {
                                    alt6=1;
                                }
                                else if ( (LA6_7==22) ) {
                                    alt6=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 6, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA6_5==RULE_STRING) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA6_4>=RULE_INT && LA6_4<=RULE_STRING)) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSceneDl.g:428:2: ( ruleRegularAttribute )
                    {
                    // InternalSceneDl.g:428:2: ( ruleRegularAttribute )
                    // InternalSceneDl.g:429:3: ruleRegularAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getRegularAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getRegularAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:434:2: ( rulePositionAttribute )
                    {
                    // InternalSceneDl.g:434:2: ( rulePositionAttribute )
                    // InternalSceneDl.g:435:3: rulePositionAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePositionAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // InternalSceneDl.g:444:1: rule__AttributeValue__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( ( rule__AttributeValue__Group_2__0 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:448:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( ( rule__AttributeValue__Group_2__0 ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    alt7=3;
                }
                else if ( (LA7_1==EOF||(LA7_1>=16 && LA7_1<=17)||(LA7_1>=20 && LA7_1<=21)||LA7_1==27) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSceneDl.g:449:2: ( RULE_INT )
                    {
                    // InternalSceneDl.g:449:2: ( RULE_INT )
                    // InternalSceneDl.g:450:3: RULE_INT
                    {
                     before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:455:2: ( RULE_STRING )
                    {
                    // InternalSceneDl.g:455:2: ( RULE_STRING )
                    // InternalSceneDl.g:456:3: RULE_STRING
                    {
                     before(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSceneDl.g:461:2: ( ( rule__AttributeValue__Group_2__0 ) )
                    {
                    // InternalSceneDl.g:461:2: ( ( rule__AttributeValue__Group_2__0 ) )
                    // InternalSceneDl.g:462:3: ( rule__AttributeValue__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_2()); 
                    // InternalSceneDl.g:463:3: ( rule__AttributeValue__Group_2__0 )
                    // InternalSceneDl.g:463:4: rule__AttributeValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalSceneDl.g:471:1: rule__AttributeType__Alternatives : ( ( ( 'range' ) ) | ( ( 'value' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:475:1: ( ( ( 'range' ) ) | ( ( 'value' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDl.g:476:2: ( ( 'range' ) )
                    {
                    // InternalSceneDl.g:476:2: ( ( 'range' ) )
                    // InternalSceneDl.g:477:3: ( 'range' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0()); 
                    // InternalSceneDl.g:478:3: ( 'range' )
                    // InternalSceneDl.g:478:4: 'range'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:482:2: ( ( 'value' ) )
                    {
                    // InternalSceneDl.g:482:2: ( ( 'value' ) )
                    // InternalSceneDl.g:483:3: ( 'value' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1()); 
                    // InternalSceneDl.g:484:3: ( 'value' )
                    // InternalSceneDl.g:484:4: 'value'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalSceneDl.g:492:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:496:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalSceneDl.g:497:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0"


    // $ANTLR start "rule__Scene__Group__0__Impl"
    // InternalSceneDl.g:504:1: rule__Scene__Group__0__Impl : ( ( rule__Scene__NameAssignment_0 ) ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:508:1: ( ( ( rule__Scene__NameAssignment_0 ) ) )
            // InternalSceneDl.g:509:1: ( ( rule__Scene__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:509:1: ( ( rule__Scene__NameAssignment_0 ) )
            // InternalSceneDl.g:510:2: ( rule__Scene__NameAssignment_0 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:511:2: ( rule__Scene__NameAssignment_0 )
            // InternalSceneDl.g:511:3: rule__Scene__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0__Impl"


    // $ANTLR start "rule__Scene__Group__1"
    // InternalSceneDl.g:519:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:523:1: ( rule__Scene__Group__1__Impl )
            // InternalSceneDl.g:524:2: rule__Scene__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1"


    // $ANTLR start "rule__Scene__Group__1__Impl"
    // InternalSceneDl.g:530:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__ElementsAssignment_1 )* ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:534:1: ( ( ( rule__Scene__ElementsAssignment_1 )* ) )
            // InternalSceneDl.g:535:1: ( ( rule__Scene__ElementsAssignment_1 )* )
            {
            // InternalSceneDl.g:535:1: ( ( rule__Scene__ElementsAssignment_1 )* )
            // InternalSceneDl.g:536:2: ( rule__Scene__ElementsAssignment_1 )*
            {
             before(grammarAccess.getSceneAccess().getElementsAssignment_1()); 
            // InternalSceneDl.g:537:2: ( rule__Scene__ElementsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSceneDl.g:537:3: rule__Scene__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scene__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group__0"
    // InternalSceneDl.g:546:1: rule__StaticEntity__Group__0 : rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1 ;
    public final void rule__StaticEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:550:1: ( rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1 )
            // InternalSceneDl.g:551:2: rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StaticEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__0"


    // $ANTLR start "rule__StaticEntity__Group__0__Impl"
    // InternalSceneDl.g:558:1: rule__StaticEntity__Group__0__Impl : ( ( rule__StaticEntity__TypeAssignment_0 ) ) ;
    public final void rule__StaticEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:562:1: ( ( ( rule__StaticEntity__TypeAssignment_0 ) ) )
            // InternalSceneDl.g:563:1: ( ( rule__StaticEntity__TypeAssignment_0 ) )
            {
            // InternalSceneDl.g:563:1: ( ( rule__StaticEntity__TypeAssignment_0 ) )
            // InternalSceneDl.g:564:2: ( rule__StaticEntity__TypeAssignment_0 )
            {
             before(grammarAccess.getStaticEntityAccess().getTypeAssignment_0()); 
            // InternalSceneDl.g:565:2: ( rule__StaticEntity__TypeAssignment_0 )
            // InternalSceneDl.g:565:3: rule__StaticEntity__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group__1"
    // InternalSceneDl.g:573:1: rule__StaticEntity__Group__1 : rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2 ;
    public final void rule__StaticEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:577:1: ( rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2 )
            // InternalSceneDl.g:578:2: rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StaticEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__1"


    // $ANTLR start "rule__StaticEntity__Group__1__Impl"
    // InternalSceneDl.g:585:1: rule__StaticEntity__Group__1__Impl : ( ( rule__StaticEntity__NameAssignment_1 ) ) ;
    public final void rule__StaticEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:589:1: ( ( ( rule__StaticEntity__NameAssignment_1 ) ) )
            // InternalSceneDl.g:590:1: ( ( rule__StaticEntity__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:590:1: ( ( rule__StaticEntity__NameAssignment_1 ) )
            // InternalSceneDl.g:591:2: ( rule__StaticEntity__NameAssignment_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:592:2: ( rule__StaticEntity__NameAssignment_1 )
            // InternalSceneDl.g:592:3: rule__StaticEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group__2"
    // InternalSceneDl.g:600:1: rule__StaticEntity__Group__2 : rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3 ;
    public final void rule__StaticEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:604:1: ( rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3 )
            // InternalSceneDl.g:605:2: rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StaticEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__2"


    // $ANTLR start "rule__StaticEntity__Group__2__Impl"
    // InternalSceneDl.g:612:1: rule__StaticEntity__Group__2__Impl : ( ( rule__StaticEntity__Group_2__0 )? ) ;
    public final void rule__StaticEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:616:1: ( ( ( rule__StaticEntity__Group_2__0 )? ) )
            // InternalSceneDl.g:617:1: ( ( rule__StaticEntity__Group_2__0 )? )
            {
            // InternalSceneDl.g:617:1: ( ( rule__StaticEntity__Group_2__0 )? )
            // InternalSceneDl.g:618:2: ( rule__StaticEntity__Group_2__0 )?
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_2()); 
            // InternalSceneDl.g:619:2: ( rule__StaticEntity__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSceneDl.g:619:3: rule__StaticEntity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStaticEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__2__Impl"


    // $ANTLR start "rule__StaticEntity__Group__3"
    // InternalSceneDl.g:627:1: rule__StaticEntity__Group__3 : rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4 ;
    public final void rule__StaticEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:631:1: ( rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4 )
            // InternalSceneDl.g:632:2: rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__StaticEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__3"


    // $ANTLR start "rule__StaticEntity__Group__3__Impl"
    // InternalSceneDl.g:639:1: rule__StaticEntity__Group__3__Impl : ( ( rule__StaticEntity__Group_3__0 )* ) ;
    public final void rule__StaticEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:643:1: ( ( ( rule__StaticEntity__Group_3__0 )* ) )
            // InternalSceneDl.g:644:1: ( ( rule__StaticEntity__Group_3__0 )* )
            {
            // InternalSceneDl.g:644:1: ( ( rule__StaticEntity__Group_3__0 )* )
            // InternalSceneDl.g:645:2: ( rule__StaticEntity__Group_3__0 )*
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_3()); 
            // InternalSceneDl.g:646:2: ( rule__StaticEntity__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSceneDl.g:646:3: rule__StaticEntity__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StaticEntity__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStaticEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__3__Impl"


    // $ANTLR start "rule__StaticEntity__Group__4"
    // InternalSceneDl.g:654:1: rule__StaticEntity__Group__4 : rule__StaticEntity__Group__4__Impl ;
    public final void rule__StaticEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:658:1: ( rule__StaticEntity__Group__4__Impl )
            // InternalSceneDl.g:659:2: rule__StaticEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__4"


    // $ANTLR start "rule__StaticEntity__Group__4__Impl"
    // InternalSceneDl.g:665:1: rule__StaticEntity__Group__4__Impl : ( ( rule__StaticEntity__Group_4__0 )? ) ;
    public final void rule__StaticEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:669:1: ( ( ( rule__StaticEntity__Group_4__0 )? ) )
            // InternalSceneDl.g:670:1: ( ( rule__StaticEntity__Group_4__0 )? )
            {
            // InternalSceneDl.g:670:1: ( ( rule__StaticEntity__Group_4__0 )? )
            // InternalSceneDl.g:671:2: ( rule__StaticEntity__Group_4__0 )?
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_4()); 
            // InternalSceneDl.g:672:2: ( rule__StaticEntity__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDl.g:672:3: rule__StaticEntity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StaticEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStaticEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group__4__Impl"


    // $ANTLR start "rule__StaticEntity__Group_2__0"
    // InternalSceneDl.g:681:1: rule__StaticEntity__Group_2__0 : rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1 ;
    public final void rule__StaticEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:685:1: ( rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1 )
            // InternalSceneDl.g:686:2: rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__StaticEntity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_2__0"


    // $ANTLR start "rule__StaticEntity__Group_2__0__Impl"
    // InternalSceneDl.g:693:1: rule__StaticEntity__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__StaticEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:697:1: ( ( 'key' ) )
            // InternalSceneDl.g:698:1: ( 'key' )
            {
            // InternalSceneDl.g:698:1: ( 'key' )
            // InternalSceneDl.g:699:2: 'key'
            {
             before(grammarAccess.getStaticEntityAccess().getKeyKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getKeyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_2__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group_2__1"
    // InternalSceneDl.g:708:1: rule__StaticEntity__Group_2__1 : rule__StaticEntity__Group_2__1__Impl ;
    public final void rule__StaticEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:712:1: ( rule__StaticEntity__Group_2__1__Impl )
            // InternalSceneDl.g:713:2: rule__StaticEntity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_2__1"


    // $ANTLR start "rule__StaticEntity__Group_2__1__Impl"
    // InternalSceneDl.g:719:1: rule__StaticEntity__Group_2__1__Impl : ( ( rule__StaticEntity__KeyAssignment_2_1 ) ) ;
    public final void rule__StaticEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:723:1: ( ( ( rule__StaticEntity__KeyAssignment_2_1 ) ) )
            // InternalSceneDl.g:724:1: ( ( rule__StaticEntity__KeyAssignment_2_1 ) )
            {
            // InternalSceneDl.g:724:1: ( ( rule__StaticEntity__KeyAssignment_2_1 ) )
            // InternalSceneDl.g:725:2: ( rule__StaticEntity__KeyAssignment_2_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getKeyAssignment_2_1()); 
            // InternalSceneDl.g:726:2: ( rule__StaticEntity__KeyAssignment_2_1 )
            // InternalSceneDl.g:726:3: rule__StaticEntity__KeyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__KeyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getKeyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_2__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group_3__0"
    // InternalSceneDl.g:735:1: rule__StaticEntity__Group_3__0 : rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1 ;
    public final void rule__StaticEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:739:1: ( rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1 )
            // InternalSceneDl.g:740:2: rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__StaticEntity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_3__0"


    // $ANTLR start "rule__StaticEntity__Group_3__0__Impl"
    // InternalSceneDl.g:747:1: rule__StaticEntity__Group_3__0__Impl : ( 'isA' ) ;
    public final void rule__StaticEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:751:1: ( ( 'isA' ) )
            // InternalSceneDl.g:752:1: ( 'isA' )
            {
            // InternalSceneDl.g:752:1: ( 'isA' )
            // InternalSceneDl.g:753:2: 'isA'
            {
             before(grammarAccess.getStaticEntityAccess().getIsAKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getIsAKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_3__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group_3__1"
    // InternalSceneDl.g:762:1: rule__StaticEntity__Group_3__1 : rule__StaticEntity__Group_3__1__Impl ;
    public final void rule__StaticEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:766:1: ( rule__StaticEntity__Group_3__1__Impl )
            // InternalSceneDl.g:767:2: rule__StaticEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_3__1"


    // $ANTLR start "rule__StaticEntity__Group_3__1__Impl"
    // InternalSceneDl.g:773:1: rule__StaticEntity__Group_3__1__Impl : ( ( rule__StaticEntity__IsAAssignment_3_1 ) ) ;
    public final void rule__StaticEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:777:1: ( ( ( rule__StaticEntity__IsAAssignment_3_1 ) ) )
            // InternalSceneDl.g:778:1: ( ( rule__StaticEntity__IsAAssignment_3_1 ) )
            {
            // InternalSceneDl.g:778:1: ( ( rule__StaticEntity__IsAAssignment_3_1 ) )
            // InternalSceneDl.g:779:2: ( rule__StaticEntity__IsAAssignment_3_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getIsAAssignment_3_1()); 
            // InternalSceneDl.g:780:2: ( rule__StaticEntity__IsAAssignment_3_1 )
            // InternalSceneDl.g:780:3: rule__StaticEntity__IsAAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__IsAAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getIsAAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_3__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4__0"
    // InternalSceneDl.g:789:1: rule__StaticEntity__Group_4__0 : rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1 ;
    public final void rule__StaticEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:793:1: ( rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1 )
            // InternalSceneDl.g:794:2: rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__StaticEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__0"


    // $ANTLR start "rule__StaticEntity__Group_4__0__Impl"
    // InternalSceneDl.g:801:1: rule__StaticEntity__Group_4__0__Impl : ( '{' ) ;
    public final void rule__StaticEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:805:1: ( ( '{' ) )
            // InternalSceneDl.g:806:1: ( '{' )
            {
            // InternalSceneDl.g:806:1: ( '{' )
            // InternalSceneDl.g:807:2: '{'
            {
             before(grammarAccess.getStaticEntityAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4__1"
    // InternalSceneDl.g:816:1: rule__StaticEntity__Group_4__1 : rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2 ;
    public final void rule__StaticEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:820:1: ( rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2 )
            // InternalSceneDl.g:821:2: rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__StaticEntity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__1"


    // $ANTLR start "rule__StaticEntity__Group_4__1__Impl"
    // InternalSceneDl.g:828:1: rule__StaticEntity__Group_4__1__Impl : ( ( rule__StaticEntity__Alternatives_4_1 ) ) ;
    public final void rule__StaticEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:832:1: ( ( ( rule__StaticEntity__Alternatives_4_1 ) ) )
            // InternalSceneDl.g:833:1: ( ( rule__StaticEntity__Alternatives_4_1 ) )
            {
            // InternalSceneDl.g:833:1: ( ( rule__StaticEntity__Alternatives_4_1 ) )
            // InternalSceneDl.g:834:2: ( rule__StaticEntity__Alternatives_4_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getAlternatives_4_1()); 
            // InternalSceneDl.g:835:2: ( rule__StaticEntity__Alternatives_4_1 )
            // InternalSceneDl.g:835:3: rule__StaticEntity__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4__2"
    // InternalSceneDl.g:843:1: rule__StaticEntity__Group_4__2 : rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3 ;
    public final void rule__StaticEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:847:1: ( rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3 )
            // InternalSceneDl.g:848:2: rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__StaticEntity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__2"


    // $ANTLR start "rule__StaticEntity__Group_4__2__Impl"
    // InternalSceneDl.g:855:1: rule__StaticEntity__Group_4__2__Impl : ( ( rule__StaticEntity__Alternatives_4_2 )* ) ;
    public final void rule__StaticEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:859:1: ( ( ( rule__StaticEntity__Alternatives_4_2 )* ) )
            // InternalSceneDl.g:860:1: ( ( rule__StaticEntity__Alternatives_4_2 )* )
            {
            // InternalSceneDl.g:860:1: ( ( rule__StaticEntity__Alternatives_4_2 )* )
            // InternalSceneDl.g:861:2: ( rule__StaticEntity__Alternatives_4_2 )*
            {
             before(grammarAccess.getStaticEntityAccess().getAlternatives_4_2()); 
            // InternalSceneDl.g:862:2: ( rule__StaticEntity__Alternatives_4_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSceneDl.g:862:3: rule__StaticEntity__Alternatives_4_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StaticEntity__Alternatives_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStaticEntityAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__2__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4__3"
    // InternalSceneDl.g:870:1: rule__StaticEntity__Group_4__3 : rule__StaticEntity__Group_4__3__Impl ;
    public final void rule__StaticEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:874:1: ( rule__StaticEntity__Group_4__3__Impl )
            // InternalSceneDl.g:875:2: rule__StaticEntity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__3"


    // $ANTLR start "rule__StaticEntity__Group_4__3__Impl"
    // InternalSceneDl.g:881:1: rule__StaticEntity__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StaticEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:885:1: ( ( '}' ) )
            // InternalSceneDl.g:886:1: ( '}' )
            {
            // InternalSceneDl.g:886:1: ( '}' )
            // InternalSceneDl.g:887:2: '}'
            {
             before(grammarAccess.getStaticEntityAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4__3__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4_2_0__0"
    // InternalSceneDl.g:897:1: rule__StaticEntity__Group_4_2_0__0 : rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1 ;
    public final void rule__StaticEntity__Group_4_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:901:1: ( rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1 )
            // InternalSceneDl.g:902:2: rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__StaticEntity__Group_4_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_0__0"


    // $ANTLR start "rule__StaticEntity__Group_4_2_0__0__Impl"
    // InternalSceneDl.g:909:1: rule__StaticEntity__Group_4_2_0__0__Impl : ( ',' ) ;
    public final void rule__StaticEntity__Group_4_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:913:1: ( ( ',' ) )
            // InternalSceneDl.g:914:1: ( ',' )
            {
            // InternalSceneDl.g:914:1: ( ',' )
            // InternalSceneDl.g:915:2: ','
            {
             before(grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_0__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4_2_0__1"
    // InternalSceneDl.g:924:1: rule__StaticEntity__Group_4_2_0__1 : rule__StaticEntity__Group_4_2_0__1__Impl ;
    public final void rule__StaticEntity__Group_4_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:928:1: ( rule__StaticEntity__Group_4_2_0__1__Impl )
            // InternalSceneDl.g:929:2: rule__StaticEntity__Group_4_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_0__1"


    // $ANTLR start "rule__StaticEntity__Group_4_2_0__1__Impl"
    // InternalSceneDl.g:935:1: rule__StaticEntity__Group_4_2_0__1__Impl : ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) ) ;
    public final void rule__StaticEntity__Group_4_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:939:1: ( ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) ) )
            // InternalSceneDl.g:940:1: ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) )
            {
            // InternalSceneDl.g:940:1: ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) )
            // InternalSceneDl.g:941:2: ( rule__StaticEntity__AttributesAssignment_4_2_0_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_2_0_1()); 
            // InternalSceneDl.g:942:2: ( rule__StaticEntity__AttributesAssignment_4_2_0_1 )
            // InternalSceneDl.g:942:3: rule__StaticEntity__AttributesAssignment_4_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__AttributesAssignment_4_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_0__1__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4_2_1__0"
    // InternalSceneDl.g:951:1: rule__StaticEntity__Group_4_2_1__0 : rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1 ;
    public final void rule__StaticEntity__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:955:1: ( rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1 )
            // InternalSceneDl.g:956:2: rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__StaticEntity__Group_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_1__0"


    // $ANTLR start "rule__StaticEntity__Group_4_2_1__0__Impl"
    // InternalSceneDl.g:963:1: rule__StaticEntity__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__StaticEntity__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:967:1: ( ( ',' ) )
            // InternalSceneDl.g:968:1: ( ',' )
            {
            // InternalSceneDl.g:968:1: ( ',' )
            // InternalSceneDl.g:969:2: ','
            {
             before(grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__StaticEntity__Group_4_2_1__1"
    // InternalSceneDl.g:978:1: rule__StaticEntity__Group_4_2_1__1 : rule__StaticEntity__Group_4_2_1__1__Impl ;
    public final void rule__StaticEntity__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:982:1: ( rule__StaticEntity__Group_4_2_1__1__Impl )
            // InternalSceneDl.g:983:2: rule__StaticEntity__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__Group_4_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_1__1"


    // $ANTLR start "rule__StaticEntity__Group_4_2_1__1__Impl"
    // InternalSceneDl.g:989:1: rule__StaticEntity__Group_4_2_1__1__Impl : ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) ) ;
    public final void rule__StaticEntity__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:993:1: ( ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) ) )
            // InternalSceneDl.g:994:1: ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) )
            {
            // InternalSceneDl.g:994:1: ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) )
            // InternalSceneDl.g:995:2: ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_2_1_1()); 
            // InternalSceneDl.g:996:2: ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 )
            // InternalSceneDl.g:996:3: rule__StaticEntity__FeaturesAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StaticEntity__FeaturesAssignment_4_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group__0"
    // InternalSceneDl.g:1005:1: rule__DynamicEntity__Group__0 : rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1 ;
    public final void rule__DynamicEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1009:1: ( rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1 )
            // InternalSceneDl.g:1010:2: rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DynamicEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__0"


    // $ANTLR start "rule__DynamicEntity__Group__0__Impl"
    // InternalSceneDl.g:1017:1: rule__DynamicEntity__Group__0__Impl : ( ( rule__DynamicEntity__TypeAssignment_0 ) ) ;
    public final void rule__DynamicEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1021:1: ( ( ( rule__DynamicEntity__TypeAssignment_0 ) ) )
            // InternalSceneDl.g:1022:1: ( ( rule__DynamicEntity__TypeAssignment_0 ) )
            {
            // InternalSceneDl.g:1022:1: ( ( rule__DynamicEntity__TypeAssignment_0 ) )
            // InternalSceneDl.g:1023:2: ( rule__DynamicEntity__TypeAssignment_0 )
            {
             before(grammarAccess.getDynamicEntityAccess().getTypeAssignment_0()); 
            // InternalSceneDl.g:1024:2: ( rule__DynamicEntity__TypeAssignment_0 )
            // InternalSceneDl.g:1024:3: rule__DynamicEntity__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group__1"
    // InternalSceneDl.g:1032:1: rule__DynamicEntity__Group__1 : rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2 ;
    public final void rule__DynamicEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1036:1: ( rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2 )
            // InternalSceneDl.g:1037:2: rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DynamicEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__1"


    // $ANTLR start "rule__DynamicEntity__Group__1__Impl"
    // InternalSceneDl.g:1044:1: rule__DynamicEntity__Group__1__Impl : ( ( rule__DynamicEntity__NameAssignment_1 ) ) ;
    public final void rule__DynamicEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1048:1: ( ( ( rule__DynamicEntity__NameAssignment_1 ) ) )
            // InternalSceneDl.g:1049:1: ( ( rule__DynamicEntity__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:1049:1: ( ( rule__DynamicEntity__NameAssignment_1 ) )
            // InternalSceneDl.g:1050:2: ( rule__DynamicEntity__NameAssignment_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:1051:2: ( rule__DynamicEntity__NameAssignment_1 )
            // InternalSceneDl.g:1051:3: rule__DynamicEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group__2"
    // InternalSceneDl.g:1059:1: rule__DynamicEntity__Group__2 : rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3 ;
    public final void rule__DynamicEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1063:1: ( rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3 )
            // InternalSceneDl.g:1064:2: rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DynamicEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__2"


    // $ANTLR start "rule__DynamicEntity__Group__2__Impl"
    // InternalSceneDl.g:1071:1: rule__DynamicEntity__Group__2__Impl : ( ( rule__DynamicEntity__Group_2__0 )? ) ;
    public final void rule__DynamicEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1075:1: ( ( ( rule__DynamicEntity__Group_2__0 )? ) )
            // InternalSceneDl.g:1076:1: ( ( rule__DynamicEntity__Group_2__0 )? )
            {
            // InternalSceneDl.g:1076:1: ( ( rule__DynamicEntity__Group_2__0 )? )
            // InternalSceneDl.g:1077:2: ( rule__DynamicEntity__Group_2__0 )?
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_2()); 
            // InternalSceneDl.g:1078:2: ( rule__DynamicEntity__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDl.g:1078:3: rule__DynamicEntity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__2__Impl"


    // $ANTLR start "rule__DynamicEntity__Group__3"
    // InternalSceneDl.g:1086:1: rule__DynamicEntity__Group__3 : rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4 ;
    public final void rule__DynamicEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1090:1: ( rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4 )
            // InternalSceneDl.g:1091:2: rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DynamicEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__3"


    // $ANTLR start "rule__DynamicEntity__Group__3__Impl"
    // InternalSceneDl.g:1098:1: rule__DynamicEntity__Group__3__Impl : ( ( rule__DynamicEntity__Group_3__0 )* ) ;
    public final void rule__DynamicEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1102:1: ( ( ( rule__DynamicEntity__Group_3__0 )* ) )
            // InternalSceneDl.g:1103:1: ( ( rule__DynamicEntity__Group_3__0 )* )
            {
            // InternalSceneDl.g:1103:1: ( ( rule__DynamicEntity__Group_3__0 )* )
            // InternalSceneDl.g:1104:2: ( rule__DynamicEntity__Group_3__0 )*
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_3()); 
            // InternalSceneDl.g:1105:2: ( rule__DynamicEntity__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSceneDl.g:1105:3: rule__DynamicEntity__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DynamicEntity__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDynamicEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__3__Impl"


    // $ANTLR start "rule__DynamicEntity__Group__4"
    // InternalSceneDl.g:1113:1: rule__DynamicEntity__Group__4 : rule__DynamicEntity__Group__4__Impl ;
    public final void rule__DynamicEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1117:1: ( rule__DynamicEntity__Group__4__Impl )
            // InternalSceneDl.g:1118:2: rule__DynamicEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__4"


    // $ANTLR start "rule__DynamicEntity__Group__4__Impl"
    // InternalSceneDl.g:1124:1: rule__DynamicEntity__Group__4__Impl : ( ( rule__DynamicEntity__Group_4__0 )? ) ;
    public final void rule__DynamicEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1128:1: ( ( ( rule__DynamicEntity__Group_4__0 )? ) )
            // InternalSceneDl.g:1129:1: ( ( rule__DynamicEntity__Group_4__0 )? )
            {
            // InternalSceneDl.g:1129:1: ( ( rule__DynamicEntity__Group_4__0 )? )
            // InternalSceneDl.g:1130:2: ( rule__DynamicEntity__Group_4__0 )?
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_4()); 
            // InternalSceneDl.g:1131:2: ( rule__DynamicEntity__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDl.g:1131:3: rule__DynamicEntity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group__4__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_2__0"
    // InternalSceneDl.g:1140:1: rule__DynamicEntity__Group_2__0 : rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1 ;
    public final void rule__DynamicEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1144:1: ( rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1 )
            // InternalSceneDl.g:1145:2: rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DynamicEntity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_2__0"


    // $ANTLR start "rule__DynamicEntity__Group_2__0__Impl"
    // InternalSceneDl.g:1152:1: rule__DynamicEntity__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__DynamicEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1156:1: ( ( 'key' ) )
            // InternalSceneDl.g:1157:1: ( 'key' )
            {
            // InternalSceneDl.g:1157:1: ( 'key' )
            // InternalSceneDl.g:1158:2: 'key'
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getKeyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_2__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_2__1"
    // InternalSceneDl.g:1167:1: rule__DynamicEntity__Group_2__1 : rule__DynamicEntity__Group_2__1__Impl ;
    public final void rule__DynamicEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1171:1: ( rule__DynamicEntity__Group_2__1__Impl )
            // InternalSceneDl.g:1172:2: rule__DynamicEntity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_2__1"


    // $ANTLR start "rule__DynamicEntity__Group_2__1__Impl"
    // InternalSceneDl.g:1178:1: rule__DynamicEntity__Group_2__1__Impl : ( ( rule__DynamicEntity__KeyAssignment_2_1 ) ) ;
    public final void rule__DynamicEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1182:1: ( ( ( rule__DynamicEntity__KeyAssignment_2_1 ) ) )
            // InternalSceneDl.g:1183:1: ( ( rule__DynamicEntity__KeyAssignment_2_1 ) )
            {
            // InternalSceneDl.g:1183:1: ( ( rule__DynamicEntity__KeyAssignment_2_1 ) )
            // InternalSceneDl.g:1184:2: ( rule__DynamicEntity__KeyAssignment_2_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyAssignment_2_1()); 
            // InternalSceneDl.g:1185:2: ( rule__DynamicEntity__KeyAssignment_2_1 )
            // InternalSceneDl.g:1185:3: rule__DynamicEntity__KeyAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__KeyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getKeyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_2__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_3__0"
    // InternalSceneDl.g:1194:1: rule__DynamicEntity__Group_3__0 : rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1 ;
    public final void rule__DynamicEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1198:1: ( rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1 )
            // InternalSceneDl.g:1199:2: rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__DynamicEntity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_3__0"


    // $ANTLR start "rule__DynamicEntity__Group_3__0__Impl"
    // InternalSceneDl.g:1206:1: rule__DynamicEntity__Group_3__0__Impl : ( 'isA' ) ;
    public final void rule__DynamicEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1210:1: ( ( 'isA' ) )
            // InternalSceneDl.g:1211:1: ( 'isA' )
            {
            // InternalSceneDl.g:1211:1: ( 'isA' )
            // InternalSceneDl.g:1212:2: 'isA'
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getIsAKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_3__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_3__1"
    // InternalSceneDl.g:1221:1: rule__DynamicEntity__Group_3__1 : rule__DynamicEntity__Group_3__1__Impl ;
    public final void rule__DynamicEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1225:1: ( rule__DynamicEntity__Group_3__1__Impl )
            // InternalSceneDl.g:1226:2: rule__DynamicEntity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_3__1"


    // $ANTLR start "rule__DynamicEntity__Group_3__1__Impl"
    // InternalSceneDl.g:1232:1: rule__DynamicEntity__Group_3__1__Impl : ( ( rule__DynamicEntity__IsAAssignment_3_1 ) ) ;
    public final void rule__DynamicEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1236:1: ( ( ( rule__DynamicEntity__IsAAssignment_3_1 ) ) )
            // InternalSceneDl.g:1237:1: ( ( rule__DynamicEntity__IsAAssignment_3_1 ) )
            {
            // InternalSceneDl.g:1237:1: ( ( rule__DynamicEntity__IsAAssignment_3_1 ) )
            // InternalSceneDl.g:1238:2: ( rule__DynamicEntity__IsAAssignment_3_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAAssignment_3_1()); 
            // InternalSceneDl.g:1239:2: ( rule__DynamicEntity__IsAAssignment_3_1 )
            // InternalSceneDl.g:1239:3: rule__DynamicEntity__IsAAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__IsAAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getIsAAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_3__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4__0"
    // InternalSceneDl.g:1248:1: rule__DynamicEntity__Group_4__0 : rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1 ;
    public final void rule__DynamicEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1252:1: ( rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1 )
            // InternalSceneDl.g:1253:2: rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__DynamicEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__0"


    // $ANTLR start "rule__DynamicEntity__Group_4__0__Impl"
    // InternalSceneDl.g:1260:1: rule__DynamicEntity__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DynamicEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1264:1: ( ( '{' ) )
            // InternalSceneDl.g:1265:1: ( '{' )
            {
            // InternalSceneDl.g:1265:1: ( '{' )
            // InternalSceneDl.g:1266:2: '{'
            {
             before(grammarAccess.getDynamicEntityAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4__1"
    // InternalSceneDl.g:1275:1: rule__DynamicEntity__Group_4__1 : rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2 ;
    public final void rule__DynamicEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1279:1: ( rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2 )
            // InternalSceneDl.g:1280:2: rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__DynamicEntity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__1"


    // $ANTLR start "rule__DynamicEntity__Group_4__1__Impl"
    // InternalSceneDl.g:1287:1: rule__DynamicEntity__Group_4__1__Impl : ( ( rule__DynamicEntity__Alternatives_4_1 ) ) ;
    public final void rule__DynamicEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1291:1: ( ( ( rule__DynamicEntity__Alternatives_4_1 ) ) )
            // InternalSceneDl.g:1292:1: ( ( rule__DynamicEntity__Alternatives_4_1 ) )
            {
            // InternalSceneDl.g:1292:1: ( ( rule__DynamicEntity__Alternatives_4_1 ) )
            // InternalSceneDl.g:1293:2: ( rule__DynamicEntity__Alternatives_4_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getAlternatives_4_1()); 
            // InternalSceneDl.g:1294:2: ( rule__DynamicEntity__Alternatives_4_1 )
            // InternalSceneDl.g:1294:3: rule__DynamicEntity__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4__2"
    // InternalSceneDl.g:1302:1: rule__DynamicEntity__Group_4__2 : rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3 ;
    public final void rule__DynamicEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1306:1: ( rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3 )
            // InternalSceneDl.g:1307:2: rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__DynamicEntity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__2"


    // $ANTLR start "rule__DynamicEntity__Group_4__2__Impl"
    // InternalSceneDl.g:1314:1: rule__DynamicEntity__Group_4__2__Impl : ( ( rule__DynamicEntity__Alternatives_4_2 )* ) ;
    public final void rule__DynamicEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1318:1: ( ( ( rule__DynamicEntity__Alternatives_4_2 )* ) )
            // InternalSceneDl.g:1319:1: ( ( rule__DynamicEntity__Alternatives_4_2 )* )
            {
            // InternalSceneDl.g:1319:1: ( ( rule__DynamicEntity__Alternatives_4_2 )* )
            // InternalSceneDl.g:1320:2: ( rule__DynamicEntity__Alternatives_4_2 )*
            {
             before(grammarAccess.getDynamicEntityAccess().getAlternatives_4_2()); 
            // InternalSceneDl.g:1321:2: ( rule__DynamicEntity__Alternatives_4_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSceneDl.g:1321:3: rule__DynamicEntity__Alternatives_4_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DynamicEntity__Alternatives_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDynamicEntityAccess().getAlternatives_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__2__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4__3"
    // InternalSceneDl.g:1329:1: rule__DynamicEntity__Group_4__3 : rule__DynamicEntity__Group_4__3__Impl ;
    public final void rule__DynamicEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1333:1: ( rule__DynamicEntity__Group_4__3__Impl )
            // InternalSceneDl.g:1334:2: rule__DynamicEntity__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__3"


    // $ANTLR start "rule__DynamicEntity__Group_4__3__Impl"
    // InternalSceneDl.g:1340:1: rule__DynamicEntity__Group_4__3__Impl : ( '}' ) ;
    public final void rule__DynamicEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1344:1: ( ( '}' ) )
            // InternalSceneDl.g:1345:1: ( '}' )
            {
            // InternalSceneDl.g:1345:1: ( '}' )
            // InternalSceneDl.g:1346:2: '}'
            {
             before(grammarAccess.getDynamicEntityAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4__3__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_0__0"
    // InternalSceneDl.g:1356:1: rule__DynamicEntity__Group_4_2_0__0 : rule__DynamicEntity__Group_4_2_0__0__Impl rule__DynamicEntity__Group_4_2_0__1 ;
    public final void rule__DynamicEntity__Group_4_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1360:1: ( rule__DynamicEntity__Group_4_2_0__0__Impl rule__DynamicEntity__Group_4_2_0__1 )
            // InternalSceneDl.g:1361:2: rule__DynamicEntity__Group_4_2_0__0__Impl rule__DynamicEntity__Group_4_2_0__1
            {
            pushFollow(FOLLOW_5);
            rule__DynamicEntity__Group_4_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_0__0"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_0__0__Impl"
    // InternalSceneDl.g:1368:1: rule__DynamicEntity__Group_4_2_0__0__Impl : ( ',' ) ;
    public final void rule__DynamicEntity__Group_4_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1372:1: ( ( ',' ) )
            // InternalSceneDl.g:1373:1: ( ',' )
            {
            // InternalSceneDl.g:1373:1: ( ',' )
            // InternalSceneDl.g:1374:2: ','
            {
             before(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_0__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_0__1"
    // InternalSceneDl.g:1383:1: rule__DynamicEntity__Group_4_2_0__1 : rule__DynamicEntity__Group_4_2_0__1__Impl ;
    public final void rule__DynamicEntity__Group_4_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1387:1: ( rule__DynamicEntity__Group_4_2_0__1__Impl )
            // InternalSceneDl.g:1388:2: rule__DynamicEntity__Group_4_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_0__1"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_0__1__Impl"
    // InternalSceneDl.g:1394:1: rule__DynamicEntity__Group_4_2_0__1__Impl : ( ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 ) ) ;
    public final void rule__DynamicEntity__Group_4_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1398:1: ( ( ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 ) ) )
            // InternalSceneDl.g:1399:1: ( ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 ) )
            {
            // InternalSceneDl.g:1399:1: ( ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 ) )
            // InternalSceneDl.g:1400:2: ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_2_0_1()); 
            // InternalSceneDl.g:1401:2: ( rule__DynamicEntity__AttributesAssignment_4_2_0_1 )
            // InternalSceneDl.g:1401:3: rule__DynamicEntity__AttributesAssignment_4_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__AttributesAssignment_4_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_0__1__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_1__0"
    // InternalSceneDl.g:1410:1: rule__DynamicEntity__Group_4_2_1__0 : rule__DynamicEntity__Group_4_2_1__0__Impl rule__DynamicEntity__Group_4_2_1__1 ;
    public final void rule__DynamicEntity__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1414:1: ( rule__DynamicEntity__Group_4_2_1__0__Impl rule__DynamicEntity__Group_4_2_1__1 )
            // InternalSceneDl.g:1415:2: rule__DynamicEntity__Group_4_2_1__0__Impl rule__DynamicEntity__Group_4_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DynamicEntity__Group_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_1__0"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_1__0__Impl"
    // InternalSceneDl.g:1422:1: rule__DynamicEntity__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__DynamicEntity__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1426:1: ( ( ',' ) )
            // InternalSceneDl.g:1427:1: ( ',' )
            {
            // InternalSceneDl.g:1427:1: ( ',' )
            // InternalSceneDl.g:1428:2: ','
            {
             before(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_1__1"
    // InternalSceneDl.g:1437:1: rule__DynamicEntity__Group_4_2_1__1 : rule__DynamicEntity__Group_4_2_1__1__Impl ;
    public final void rule__DynamicEntity__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1441:1: ( rule__DynamicEntity__Group_4_2_1__1__Impl )
            // InternalSceneDl.g:1442:2: rule__DynamicEntity__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_1__1"


    // $ANTLR start "rule__DynamicEntity__Group_4_2_1__1__Impl"
    // InternalSceneDl.g:1448:1: rule__DynamicEntity__Group_4_2_1__1__Impl : ( ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 ) ) ;
    public final void rule__DynamicEntity__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1452:1: ( ( ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 ) ) )
            // InternalSceneDl.g:1453:1: ( ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 ) )
            {
            // InternalSceneDl.g:1453:1: ( ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 ) )
            // InternalSceneDl.g:1454:2: ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getContainsAssignment_4_2_1_1()); 
            // InternalSceneDl.g:1455:2: ( rule__DynamicEntity__ContainsAssignment_4_2_1_1 )
            // InternalSceneDl.g:1455:3: rule__DynamicEntity__ContainsAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__ContainsAssignment_4_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getContainsAssignment_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalSceneDl.g:1464:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1468:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalSceneDl.g:1469:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalSceneDl.g:1476:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1480:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalSceneDl.g:1481:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalSceneDl.g:1481:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalSceneDl.g:1482:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalSceneDl.g:1483:2: ( rule__Feature__ManyAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDl.g:1483:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalSceneDl.g:1491:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1495:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalSceneDl.g:1496:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalSceneDl.g:1503:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1507:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalSceneDl.g:1508:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:1508:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalSceneDl.g:1509:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:1510:2: ( rule__Feature__NameAssignment_1 )
            // InternalSceneDl.g:1510:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalSceneDl.g:1518:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1522:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalSceneDl.g:1523:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalSceneDl.g:1530:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1534:1: ( ( ':' ) )
            // InternalSceneDl.g:1535:1: ( ':' )
            {
            // InternalSceneDl.g:1535:1: ( ':' )
            // InternalSceneDl.g:1536:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalSceneDl.g:1545:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1549:1: ( rule__Feature__Group__3__Impl )
            // InternalSceneDl.g:1550:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalSceneDl.g:1556:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1560:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalSceneDl.g:1561:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalSceneDl.g:1561:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalSceneDl.g:1562:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalSceneDl.g:1563:2: ( rule__Feature__TypeAssignment_3 )
            // InternalSceneDl.g:1563:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Contain__Group__0"
    // InternalSceneDl.g:1572:1: rule__Contain__Group__0 : rule__Contain__Group__0__Impl rule__Contain__Group__1 ;
    public final void rule__Contain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1576:1: ( rule__Contain__Group__0__Impl rule__Contain__Group__1 )
            // InternalSceneDl.g:1577:2: rule__Contain__Group__0__Impl rule__Contain__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Contain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__0"


    // $ANTLR start "rule__Contain__Group__0__Impl"
    // InternalSceneDl.g:1584:1: rule__Contain__Group__0__Impl : ( ( rule__Contain__ManyAssignment_0 )? ) ;
    public final void rule__Contain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1588:1: ( ( ( rule__Contain__ManyAssignment_0 )? ) )
            // InternalSceneDl.g:1589:1: ( ( rule__Contain__ManyAssignment_0 )? )
            {
            // InternalSceneDl.g:1589:1: ( ( rule__Contain__ManyAssignment_0 )? )
            // InternalSceneDl.g:1590:2: ( rule__Contain__ManyAssignment_0 )?
            {
             before(grammarAccess.getContainAccess().getManyAssignment_0()); 
            // InternalSceneDl.g:1591:2: ( rule__Contain__ManyAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDl.g:1591:3: rule__Contain__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contain__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__0__Impl"


    // $ANTLR start "rule__Contain__Group__1"
    // InternalSceneDl.g:1599:1: rule__Contain__Group__1 : rule__Contain__Group__1__Impl rule__Contain__Group__2 ;
    public final void rule__Contain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1603:1: ( rule__Contain__Group__1__Impl rule__Contain__Group__2 )
            // InternalSceneDl.g:1604:2: rule__Contain__Group__1__Impl rule__Contain__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Contain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__1"


    // $ANTLR start "rule__Contain__Group__1__Impl"
    // InternalSceneDl.g:1611:1: rule__Contain__Group__1__Impl : ( ( rule__Contain__NameAssignment_1 ) ) ;
    public final void rule__Contain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1615:1: ( ( ( rule__Contain__NameAssignment_1 ) ) )
            // InternalSceneDl.g:1616:1: ( ( rule__Contain__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:1616:1: ( ( rule__Contain__NameAssignment_1 ) )
            // InternalSceneDl.g:1617:2: ( rule__Contain__NameAssignment_1 )
            {
             before(grammarAccess.getContainAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:1618:2: ( rule__Contain__NameAssignment_1 )
            // InternalSceneDl.g:1618:3: rule__Contain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__1__Impl"


    // $ANTLR start "rule__Contain__Group__2"
    // InternalSceneDl.g:1626:1: rule__Contain__Group__2 : rule__Contain__Group__2__Impl rule__Contain__Group__3 ;
    public final void rule__Contain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1630:1: ( rule__Contain__Group__2__Impl rule__Contain__Group__3 )
            // InternalSceneDl.g:1631:2: rule__Contain__Group__2__Impl rule__Contain__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Contain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__2"


    // $ANTLR start "rule__Contain__Group__2__Impl"
    // InternalSceneDl.g:1638:1: rule__Contain__Group__2__Impl : ( ':' ) ;
    public final void rule__Contain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1642:1: ( ( ':' ) )
            // InternalSceneDl.g:1643:1: ( ':' )
            {
            // InternalSceneDl.g:1643:1: ( ':' )
            // InternalSceneDl.g:1644:2: ':'
            {
             before(grammarAccess.getContainAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContainAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__2__Impl"


    // $ANTLR start "rule__Contain__Group__3"
    // InternalSceneDl.g:1653:1: rule__Contain__Group__3 : rule__Contain__Group__3__Impl ;
    public final void rule__Contain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1657:1: ( rule__Contain__Group__3__Impl )
            // InternalSceneDl.g:1658:2: rule__Contain__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contain__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__3"


    // $ANTLR start "rule__Contain__Group__3__Impl"
    // InternalSceneDl.g:1664:1: rule__Contain__Group__3__Impl : ( ( rule__Contain__TypeAssignment_3 ) ) ;
    public final void rule__Contain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1668:1: ( ( ( rule__Contain__TypeAssignment_3 ) ) )
            // InternalSceneDl.g:1669:1: ( ( rule__Contain__TypeAssignment_3 ) )
            {
            // InternalSceneDl.g:1669:1: ( ( rule__Contain__TypeAssignment_3 ) )
            // InternalSceneDl.g:1670:2: ( rule__Contain__TypeAssignment_3 )
            {
             before(grammarAccess.getContainAccess().getTypeAssignment_3()); 
            // InternalSceneDl.g:1671:2: ( rule__Contain__TypeAssignment_3 )
            // InternalSceneDl.g:1671:3: rule__Contain__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Contain__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContainAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__Group__3__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__0"
    // InternalSceneDl.g:1680:1: rule__RegularAttribute__Group__0 : rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1 ;
    public final void rule__RegularAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1684:1: ( rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1 )
            // InternalSceneDl.g:1685:2: rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RegularAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__0"


    // $ANTLR start "rule__RegularAttribute__Group__0__Impl"
    // InternalSceneDl.g:1692:1: rule__RegularAttribute__Group__0__Impl : ( ( rule__RegularAttribute__NameAssignment_0 ) ) ;
    public final void rule__RegularAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1696:1: ( ( ( rule__RegularAttribute__NameAssignment_0 ) ) )
            // InternalSceneDl.g:1697:1: ( ( rule__RegularAttribute__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:1697:1: ( ( rule__RegularAttribute__NameAssignment_0 ) )
            // InternalSceneDl.g:1698:2: ( rule__RegularAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getRegularAttributeAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:1699:2: ( rule__RegularAttribute__NameAssignment_0 )
            // InternalSceneDl.g:1699:3: rule__RegularAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__0__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__1"
    // InternalSceneDl.g:1707:1: rule__RegularAttribute__Group__1 : rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2 ;
    public final void rule__RegularAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1711:1: ( rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2 )
            // InternalSceneDl.g:1712:2: rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RegularAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__1"


    // $ANTLR start "rule__RegularAttribute__Group__1__Impl"
    // InternalSceneDl.g:1719:1: rule__RegularAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__RegularAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1723:1: ( ( ':' ) )
            // InternalSceneDl.g:1724:1: ( ':' )
            {
            // InternalSceneDl.g:1724:1: ( ':' )
            // InternalSceneDl.g:1725:2: ':'
            {
             before(grammarAccess.getRegularAttributeAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRegularAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__1__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__2"
    // InternalSceneDl.g:1734:1: rule__RegularAttribute__Group__2 : rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3 ;
    public final void rule__RegularAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1738:1: ( rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3 )
            // InternalSceneDl.g:1739:2: rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RegularAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__2"


    // $ANTLR start "rule__RegularAttribute__Group__2__Impl"
    // InternalSceneDl.g:1746:1: rule__RegularAttribute__Group__2__Impl : ( ( rule__RegularAttribute__TypeAssignment_2 ) ) ;
    public final void rule__RegularAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1750:1: ( ( ( rule__RegularAttribute__TypeAssignment_2 ) ) )
            // InternalSceneDl.g:1751:1: ( ( rule__RegularAttribute__TypeAssignment_2 ) )
            {
            // InternalSceneDl.g:1751:1: ( ( rule__RegularAttribute__TypeAssignment_2 ) )
            // InternalSceneDl.g:1752:2: ( rule__RegularAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getRegularAttributeAccess().getTypeAssignment_2()); 
            // InternalSceneDl.g:1753:2: ( rule__RegularAttribute__TypeAssignment_2 )
            // InternalSceneDl.g:1753:3: rule__RegularAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__2__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__3"
    // InternalSceneDl.g:1761:1: rule__RegularAttribute__Group__3 : rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4 ;
    public final void rule__RegularAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1765:1: ( rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4 )
            // InternalSceneDl.g:1766:2: rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RegularAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__3"


    // $ANTLR start "rule__RegularAttribute__Group__3__Impl"
    // InternalSceneDl.g:1773:1: rule__RegularAttribute__Group__3__Impl : ( ( '[' )? ) ;
    public final void rule__RegularAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1777:1: ( ( ( '[' )? ) )
            // InternalSceneDl.g:1778:1: ( ( '[' )? )
            {
            // InternalSceneDl.g:1778:1: ( ( '[' )? )
            // InternalSceneDl.g:1779:2: ( '[' )?
            {
             before(grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3()); 
            // InternalSceneDl.g:1780:2: ( '[' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSceneDl.g:1780:3: '['
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__3__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__4"
    // InternalSceneDl.g:1788:1: rule__RegularAttribute__Group__4 : rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5 ;
    public final void rule__RegularAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1792:1: ( rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5 )
            // InternalSceneDl.g:1793:2: rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__RegularAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__4"


    // $ANTLR start "rule__RegularAttribute__Group__4__Impl"
    // InternalSceneDl.g:1800:1: rule__RegularAttribute__Group__4__Impl : ( ( rule__RegularAttribute__ValueAssignment_4 ) ) ;
    public final void rule__RegularAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1804:1: ( ( ( rule__RegularAttribute__ValueAssignment_4 ) ) )
            // InternalSceneDl.g:1805:1: ( ( rule__RegularAttribute__ValueAssignment_4 ) )
            {
            // InternalSceneDl.g:1805:1: ( ( rule__RegularAttribute__ValueAssignment_4 ) )
            // InternalSceneDl.g:1806:2: ( rule__RegularAttribute__ValueAssignment_4 )
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAssignment_4()); 
            // InternalSceneDl.g:1807:2: ( rule__RegularAttribute__ValueAssignment_4 )
            // InternalSceneDl.g:1807:3: rule__RegularAttribute__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularAttributeAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__4__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__5"
    // InternalSceneDl.g:1815:1: rule__RegularAttribute__Group__5 : rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6 ;
    public final void rule__RegularAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1819:1: ( rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6 )
            // InternalSceneDl.g:1820:2: rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__RegularAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__5"


    // $ANTLR start "rule__RegularAttribute__Group__5__Impl"
    // InternalSceneDl.g:1827:1: rule__RegularAttribute__Group__5__Impl : ( ( rule__RegularAttribute__Group_5__0 )? ) ;
    public final void rule__RegularAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1831:1: ( ( ( rule__RegularAttribute__Group_5__0 )? ) )
            // InternalSceneDl.g:1832:1: ( ( rule__RegularAttribute__Group_5__0 )? )
            {
            // InternalSceneDl.g:1832:1: ( ( rule__RegularAttribute__Group_5__0 )? )
            // InternalSceneDl.g:1833:2: ( rule__RegularAttribute__Group_5__0 )?
            {
             before(grammarAccess.getRegularAttributeAccess().getGroup_5()); 
            // InternalSceneDl.g:1834:2: ( rule__RegularAttribute__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSceneDl.g:1834:3: rule__RegularAttribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAttribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__5__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__6"
    // InternalSceneDl.g:1842:1: rule__RegularAttribute__Group__6 : rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7 ;
    public final void rule__RegularAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1846:1: ( rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7 )
            // InternalSceneDl.g:1847:2: rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__RegularAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__6"


    // $ANTLR start "rule__RegularAttribute__Group__6__Impl"
    // InternalSceneDl.g:1854:1: rule__RegularAttribute__Group__6__Impl : ( ( ']' )? ) ;
    public final void rule__RegularAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1858:1: ( ( ( ']' )? ) )
            // InternalSceneDl.g:1859:1: ( ( ']' )? )
            {
            // InternalSceneDl.g:1859:1: ( ( ']' )? )
            // InternalSceneDl.g:1860:2: ( ']' )?
            {
             before(grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6()); 
            // InternalSceneDl.g:1861:2: ( ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSceneDl.g:1861:3: ']'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__6__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__7"
    // InternalSceneDl.g:1869:1: rule__RegularAttribute__Group__7 : rule__RegularAttribute__Group__7__Impl ;
    public final void rule__RegularAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1873:1: ( rule__RegularAttribute__Group__7__Impl )
            // InternalSceneDl.g:1874:2: rule__RegularAttribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__7"


    // $ANTLR start "rule__RegularAttribute__Group__7__Impl"
    // InternalSceneDl.g:1880:1: rule__RegularAttribute__Group__7__Impl : ( ( rule__RegularAttribute__IsTransientAssignment_7 )? ) ;
    public final void rule__RegularAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1884:1: ( ( ( rule__RegularAttribute__IsTransientAssignment_7 )? ) )
            // InternalSceneDl.g:1885:1: ( ( rule__RegularAttribute__IsTransientAssignment_7 )? )
            {
            // InternalSceneDl.g:1885:1: ( ( rule__RegularAttribute__IsTransientAssignment_7 )? )
            // InternalSceneDl.g:1886:2: ( rule__RegularAttribute__IsTransientAssignment_7 )?
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientAssignment_7()); 
            // InternalSceneDl.g:1887:2: ( rule__RegularAttribute__IsTransientAssignment_7 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSceneDl.g:1887:3: rule__RegularAttribute__IsTransientAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__RegularAttribute__IsTransientAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularAttributeAccess().getIsTransientAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group__7__Impl"


    // $ANTLR start "rule__RegularAttribute__Group_5__0"
    // InternalSceneDl.g:1896:1: rule__RegularAttribute__Group_5__0 : rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1 ;
    public final void rule__RegularAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1900:1: ( rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1 )
            // InternalSceneDl.g:1901:2: rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__RegularAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group_5__0"


    // $ANTLR start "rule__RegularAttribute__Group_5__0__Impl"
    // InternalSceneDl.g:1908:1: rule__RegularAttribute__Group_5__0__Impl : ( '-' ) ;
    public final void rule__RegularAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1912:1: ( ( '-' ) )
            // InternalSceneDl.g:1913:1: ( '-' )
            {
            // InternalSceneDl.g:1913:1: ( '-' )
            // InternalSceneDl.g:1914:2: '-'
            {
             before(grammarAccess.getRegularAttributeAccess().getHyphenMinusKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRegularAttributeAccess().getHyphenMinusKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__RegularAttribute__Group_5__1"
    // InternalSceneDl.g:1923:1: rule__RegularAttribute__Group_5__1 : rule__RegularAttribute__Group_5__1__Impl ;
    public final void rule__RegularAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1927:1: ( rule__RegularAttribute__Group_5__1__Impl )
            // InternalSceneDl.g:1928:2: rule__RegularAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group_5__1"


    // $ANTLR start "rule__RegularAttribute__Group_5__1__Impl"
    // InternalSceneDl.g:1934:1: rule__RegularAttribute__Group_5__1__Impl : ( ( rule__RegularAttribute__ValueAssignment_5_1 ) ) ;
    public final void rule__RegularAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1938:1: ( ( ( rule__RegularAttribute__ValueAssignment_5_1 ) ) )
            // InternalSceneDl.g:1939:1: ( ( rule__RegularAttribute__ValueAssignment_5_1 ) )
            {
            // InternalSceneDl.g:1939:1: ( ( rule__RegularAttribute__ValueAssignment_5_1 ) )
            // InternalSceneDl.g:1940:2: ( rule__RegularAttribute__ValueAssignment_5_1 )
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAssignment_5_1()); 
            // InternalSceneDl.g:1941:2: ( rule__RegularAttribute__ValueAssignment_5_1 )
            // InternalSceneDl.g:1941:3: rule__RegularAttribute__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularAttribute__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularAttributeAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__0"
    // InternalSceneDl.g:1950:1: rule__PositionAttribute__Group__0 : rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1 ;
    public final void rule__PositionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1954:1: ( rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1 )
            // InternalSceneDl.g:1955:2: rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PositionAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__0"


    // $ANTLR start "rule__PositionAttribute__Group__0__Impl"
    // InternalSceneDl.g:1962:1: rule__PositionAttribute__Group__0__Impl : ( ( rule__PositionAttribute__NameAssignment_0 ) ) ;
    public final void rule__PositionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1966:1: ( ( ( rule__PositionAttribute__NameAssignment_0 ) ) )
            // InternalSceneDl.g:1967:1: ( ( rule__PositionAttribute__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:1967:1: ( ( rule__PositionAttribute__NameAssignment_0 ) )
            // InternalSceneDl.g:1968:2: ( rule__PositionAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getPositionAttributeAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:1969:2: ( rule__PositionAttribute__NameAssignment_0 )
            // InternalSceneDl.g:1969:3: rule__PositionAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__0__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__1"
    // InternalSceneDl.g:1977:1: rule__PositionAttribute__Group__1 : rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2 ;
    public final void rule__PositionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1981:1: ( rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2 )
            // InternalSceneDl.g:1982:2: rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__PositionAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__1"


    // $ANTLR start "rule__PositionAttribute__Group__1__Impl"
    // InternalSceneDl.g:1989:1: rule__PositionAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__PositionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1993:1: ( ( ':' ) )
            // InternalSceneDl.g:1994:1: ( ':' )
            {
            // InternalSceneDl.g:1994:1: ( ':' )
            // InternalSceneDl.g:1995:2: ':'
            {
             before(grammarAccess.getPositionAttributeAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__1__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__2"
    // InternalSceneDl.g:2004:1: rule__PositionAttribute__Group__2 : rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3 ;
    public final void rule__PositionAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2008:1: ( rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3 )
            // InternalSceneDl.g:2009:2: rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__PositionAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__2"


    // $ANTLR start "rule__PositionAttribute__Group__2__Impl"
    // InternalSceneDl.g:2016:1: rule__PositionAttribute__Group__2__Impl : ( ( rule__PositionAttribute__TypeAssignment_2 ) ) ;
    public final void rule__PositionAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2020:1: ( ( ( rule__PositionAttribute__TypeAssignment_2 ) ) )
            // InternalSceneDl.g:2021:1: ( ( rule__PositionAttribute__TypeAssignment_2 ) )
            {
            // InternalSceneDl.g:2021:1: ( ( rule__PositionAttribute__TypeAssignment_2 ) )
            // InternalSceneDl.g:2022:2: ( rule__PositionAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getPositionAttributeAccess().getTypeAssignment_2()); 
            // InternalSceneDl.g:2023:2: ( rule__PositionAttribute__TypeAssignment_2 )
            // InternalSceneDl.g:2023:3: rule__PositionAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__2__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__3"
    // InternalSceneDl.g:2031:1: rule__PositionAttribute__Group__3 : rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4 ;
    public final void rule__PositionAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2035:1: ( rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4 )
            // InternalSceneDl.g:2036:2: rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__PositionAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__3"


    // $ANTLR start "rule__PositionAttribute__Group__3__Impl"
    // InternalSceneDl.g:2043:1: rule__PositionAttribute__Group__3__Impl : ( '[' ) ;
    public final void rule__PositionAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2047:1: ( ( '[' ) )
            // InternalSceneDl.g:2048:1: ( '[' )
            {
            // InternalSceneDl.g:2048:1: ( '[' )
            // InternalSceneDl.g:2049:2: '['
            {
             before(grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__3__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__4"
    // InternalSceneDl.g:2058:1: rule__PositionAttribute__Group__4 : rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5 ;
    public final void rule__PositionAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2062:1: ( rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5 )
            // InternalSceneDl.g:2063:2: rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__PositionAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__4"


    // $ANTLR start "rule__PositionAttribute__Group__4__Impl"
    // InternalSceneDl.g:2070:1: rule__PositionAttribute__Group__4__Impl : ( ( rule__PositionAttribute__XAssignment_4 ) ) ;
    public final void rule__PositionAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2074:1: ( ( ( rule__PositionAttribute__XAssignment_4 ) ) )
            // InternalSceneDl.g:2075:1: ( ( rule__PositionAttribute__XAssignment_4 ) )
            {
            // InternalSceneDl.g:2075:1: ( ( rule__PositionAttribute__XAssignment_4 ) )
            // InternalSceneDl.g:2076:2: ( rule__PositionAttribute__XAssignment_4 )
            {
             before(grammarAccess.getPositionAttributeAccess().getXAssignment_4()); 
            // InternalSceneDl.g:2077:2: ( rule__PositionAttribute__XAssignment_4 )
            // InternalSceneDl.g:2077:3: rule__PositionAttribute__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPositionAttributeAccess().getXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__4__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__5"
    // InternalSceneDl.g:2085:1: rule__PositionAttribute__Group__5 : rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6 ;
    public final void rule__PositionAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2089:1: ( rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6 )
            // InternalSceneDl.g:2090:2: rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__PositionAttribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__5"


    // $ANTLR start "rule__PositionAttribute__Group__5__Impl"
    // InternalSceneDl.g:2097:1: rule__PositionAttribute__Group__5__Impl : ( ';' ) ;
    public final void rule__PositionAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2101:1: ( ( ';' ) )
            // InternalSceneDl.g:2102:1: ( ';' )
            {
            // InternalSceneDl.g:2102:1: ( ';' )
            // InternalSceneDl.g:2103:2: ';'
            {
             before(grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__5__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__6"
    // InternalSceneDl.g:2112:1: rule__PositionAttribute__Group__6 : rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7 ;
    public final void rule__PositionAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2116:1: ( rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7 )
            // InternalSceneDl.g:2117:2: rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__PositionAttribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__6"


    // $ANTLR start "rule__PositionAttribute__Group__6__Impl"
    // InternalSceneDl.g:2124:1: rule__PositionAttribute__Group__6__Impl : ( ( rule__PositionAttribute__YAssignment_6 ) ) ;
    public final void rule__PositionAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2128:1: ( ( ( rule__PositionAttribute__YAssignment_6 ) ) )
            // InternalSceneDl.g:2129:1: ( ( rule__PositionAttribute__YAssignment_6 ) )
            {
            // InternalSceneDl.g:2129:1: ( ( rule__PositionAttribute__YAssignment_6 ) )
            // InternalSceneDl.g:2130:2: ( rule__PositionAttribute__YAssignment_6 )
            {
             before(grammarAccess.getPositionAttributeAccess().getYAssignment_6()); 
            // InternalSceneDl.g:2131:2: ( rule__PositionAttribute__YAssignment_6 )
            // InternalSceneDl.g:2131:3: rule__PositionAttribute__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPositionAttributeAccess().getYAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__6__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__7"
    // InternalSceneDl.g:2139:1: rule__PositionAttribute__Group__7 : rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8 ;
    public final void rule__PositionAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2143:1: ( rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8 )
            // InternalSceneDl.g:2144:2: rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__PositionAttribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__7"


    // $ANTLR start "rule__PositionAttribute__Group__7__Impl"
    // InternalSceneDl.g:2151:1: rule__PositionAttribute__Group__7__Impl : ( ']' ) ;
    public final void rule__PositionAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2155:1: ( ( ']' ) )
            // InternalSceneDl.g:2156:1: ( ']' )
            {
            // InternalSceneDl.g:2156:1: ( ']' )
            // InternalSceneDl.g:2157:2: ']'
            {
             before(grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__7__Impl"


    // $ANTLR start "rule__PositionAttribute__Group__8"
    // InternalSceneDl.g:2166:1: rule__PositionAttribute__Group__8 : rule__PositionAttribute__Group__8__Impl ;
    public final void rule__PositionAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2170:1: ( rule__PositionAttribute__Group__8__Impl )
            // InternalSceneDl.g:2171:2: rule__PositionAttribute__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionAttribute__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__8"


    // $ANTLR start "rule__PositionAttribute__Group__8__Impl"
    // InternalSceneDl.g:2177:1: rule__PositionAttribute__Group__8__Impl : ( ( rule__PositionAttribute__IsTransientAssignment_8 )? ) ;
    public final void rule__PositionAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2181:1: ( ( ( rule__PositionAttribute__IsTransientAssignment_8 )? ) )
            // InternalSceneDl.g:2182:1: ( ( rule__PositionAttribute__IsTransientAssignment_8 )? )
            {
            // InternalSceneDl.g:2182:1: ( ( rule__PositionAttribute__IsTransientAssignment_8 )? )
            // InternalSceneDl.g:2183:2: ( rule__PositionAttribute__IsTransientAssignment_8 )?
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientAssignment_8()); 
            // InternalSceneDl.g:2184:2: ( rule__PositionAttribute__IsTransientAssignment_8 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSceneDl.g:2184:3: rule__PositionAttribute__IsTransientAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__PositionAttribute__IsTransientAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAttributeAccess().getIsTransientAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__Group__8__Impl"


    // $ANTLR start "rule__AttributeValue__Group_2__0"
    // InternalSceneDl.g:2193:1: rule__AttributeValue__Group_2__0 : rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1 ;
    public final void rule__AttributeValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2197:1: ( rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1 )
            // InternalSceneDl.g:2198:2: rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__AttributeValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__0"


    // $ANTLR start "rule__AttributeValue__Group_2__0__Impl"
    // InternalSceneDl.g:2205:1: rule__AttributeValue__Group_2__0__Impl : ( RULE_INT ) ;
    public final void rule__AttributeValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2209:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2210:1: ( RULE_INT )
            {
            // InternalSceneDl.g:2210:1: ( RULE_INT )
            // InternalSceneDl.g:2211:2: RULE_INT
            {
             before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeValue__Group_2__1"
    // InternalSceneDl.g:2220:1: rule__AttributeValue__Group_2__1 : rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2 ;
    public final void rule__AttributeValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2224:1: ( rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2 )
            // InternalSceneDl.g:2225:2: rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__AttributeValue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__1"


    // $ANTLR start "rule__AttributeValue__Group_2__1__Impl"
    // InternalSceneDl.g:2232:1: rule__AttributeValue__Group_2__1__Impl : ( '.' ) ;
    public final void rule__AttributeValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2236:1: ( ( '.' ) )
            // InternalSceneDl.g:2237:1: ( '.' )
            {
            // InternalSceneDl.g:2237:1: ( '.' )
            // InternalSceneDl.g:2238:2: '.'
            {
             before(grammarAccess.getAttributeValueAccess().getFullStopKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeValue__Group_2__2"
    // InternalSceneDl.g:2247:1: rule__AttributeValue__Group_2__2 : rule__AttributeValue__Group_2__2__Impl ;
    public final void rule__AttributeValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2251:1: ( rule__AttributeValue__Group_2__2__Impl )
            // InternalSceneDl.g:2252:2: rule__AttributeValue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValue__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__2"


    // $ANTLR start "rule__AttributeValue__Group_2__2__Impl"
    // InternalSceneDl.g:2258:1: rule__AttributeValue__Group_2__2__Impl : ( RULE_INT ) ;
    public final void rule__AttributeValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2262:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2263:1: ( RULE_INT )
            {
            // InternalSceneDl.g:2263:1: ( RULE_INT )
            // InternalSceneDl.g:2264:2: RULE_INT
            {
             before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Group_2__2__Impl"


    // $ANTLR start "rule__Scene__NameAssignment_0"
    // InternalSceneDl.g:2274:1: rule__Scene__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2278:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2279:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2279:2: ( RULE_ID )
            // InternalSceneDl.g:2280:3: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_0"


    // $ANTLR start "rule__Scene__ElementsAssignment_1"
    // InternalSceneDl.g:2289:1: rule__Scene__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Scene__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2293:1: ( ( ruleElement ) )
            // InternalSceneDl.g:2294:2: ( ruleElement )
            {
            // InternalSceneDl.g:2294:2: ( ruleElement )
            // InternalSceneDl.g:2295:3: ruleElement
            {
             before(grammarAccess.getSceneAccess().getElementsElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getElementsElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ElementsAssignment_1"


    // $ANTLR start "rule__StaticEntity__TypeAssignment_0"
    // InternalSceneDl.g:2304:1: rule__StaticEntity__TypeAssignment_0 : ( ( 'static_entity' ) ) ;
    public final void rule__StaticEntity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2308:1: ( ( ( 'static_entity' ) ) )
            // InternalSceneDl.g:2309:2: ( ( 'static_entity' ) )
            {
            // InternalSceneDl.g:2309:2: ( ( 'static_entity' ) )
            // InternalSceneDl.g:2310:3: ( 'static_entity' )
            {
             before(grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0()); 
            // InternalSceneDl.g:2311:3: ( 'static_entity' )
            // InternalSceneDl.g:2312:4: 'static_entity'
            {
             before(grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0()); 

            }

             after(grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__TypeAssignment_0"


    // $ANTLR start "rule__StaticEntity__NameAssignment_1"
    // InternalSceneDl.g:2323:1: rule__StaticEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StaticEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2327:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2328:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2328:2: ( RULE_ID )
            // InternalSceneDl.g:2329:3: RULE_ID
            {
             before(grammarAccess.getStaticEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__NameAssignment_1"


    // $ANTLR start "rule__StaticEntity__KeyAssignment_2_1"
    // InternalSceneDl.g:2338:1: rule__StaticEntity__KeyAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__KeyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2342:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2343:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2343:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2344:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getKeyAttributeCrossReference_2_1_0()); 
            // InternalSceneDl.g:2345:3: ( RULE_ID )
            // InternalSceneDl.g:2346:4: RULE_ID
            {
             before(grammarAccess.getStaticEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStaticEntityAccess().getKeyAttributeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__KeyAssignment_2_1"


    // $ANTLR start "rule__StaticEntity__IsAAssignment_3_1"
    // InternalSceneDl.g:2357:1: rule__StaticEntity__IsAAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__IsAAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2361:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2362:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2362:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2363:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getIsAElementCrossReference_3_1_0()); 
            // InternalSceneDl.g:2364:3: ( RULE_ID )
            // InternalSceneDl.g:2365:4: RULE_ID
            {
             before(grammarAccess.getStaticEntityAccess().getIsAElementIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getIsAElementIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStaticEntityAccess().getIsAElementCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__IsAAssignment_3_1"


    // $ANTLR start "rule__StaticEntity__AttributesAssignment_4_1_0"
    // InternalSceneDl.g:2376:1: rule__StaticEntity__AttributesAssignment_4_1_0 : ( ruleAttribute ) ;
    public final void rule__StaticEntity__AttributesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2380:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2381:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2381:2: ( ruleAttribute )
            // InternalSceneDl.g:2382:3: ruleAttribute
            {
             before(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__AttributesAssignment_4_1_0"


    // $ANTLR start "rule__StaticEntity__FeaturesAssignment_4_1_1"
    // InternalSceneDl.g:2391:1: rule__StaticEntity__FeaturesAssignment_4_1_1 : ( ruleFeature ) ;
    public final void rule__StaticEntity__FeaturesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2395:1: ( ( ruleFeature ) )
            // InternalSceneDl.g:2396:2: ( ruleFeature )
            {
            // InternalSceneDl.g:2396:2: ( ruleFeature )
            // InternalSceneDl.g:2397:3: ruleFeature
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__FeaturesAssignment_4_1_1"


    // $ANTLR start "rule__StaticEntity__AttributesAssignment_4_2_0_1"
    // InternalSceneDl.g:2406:1: rule__StaticEntity__AttributesAssignment_4_2_0_1 : ( ruleAttribute ) ;
    public final void rule__StaticEntity__AttributesAssignment_4_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2410:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2411:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2411:2: ( ruleAttribute )
            // InternalSceneDl.g:2412:3: ruleAttribute
            {
             before(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__AttributesAssignment_4_2_0_1"


    // $ANTLR start "rule__StaticEntity__FeaturesAssignment_4_2_1_1"
    // InternalSceneDl.g:2421:1: rule__StaticEntity__FeaturesAssignment_4_2_1_1 : ( ruleFeature ) ;
    public final void rule__StaticEntity__FeaturesAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2425:1: ( ( ruleFeature ) )
            // InternalSceneDl.g:2426:2: ( ruleFeature )
            {
            // InternalSceneDl.g:2426:2: ( ruleFeature )
            // InternalSceneDl.g:2427:3: ruleFeature
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticEntity__FeaturesAssignment_4_2_1_1"


    // $ANTLR start "rule__DynamicEntity__TypeAssignment_0"
    // InternalSceneDl.g:2436:1: rule__DynamicEntity__TypeAssignment_0 : ( ( 'dynamic_entity' ) ) ;
    public final void rule__DynamicEntity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2440:1: ( ( ( 'dynamic_entity' ) ) )
            // InternalSceneDl.g:2441:2: ( ( 'dynamic_entity' ) )
            {
            // InternalSceneDl.g:2441:2: ( ( 'dynamic_entity' ) )
            // InternalSceneDl.g:2442:3: ( 'dynamic_entity' )
            {
             before(grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0()); 
            // InternalSceneDl.g:2443:3: ( 'dynamic_entity' )
            // InternalSceneDl.g:2444:4: 'dynamic_entity'
            {
             before(grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0()); 

            }

             after(grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__TypeAssignment_0"


    // $ANTLR start "rule__DynamicEntity__NameAssignment_1"
    // InternalSceneDl.g:2455:1: rule__DynamicEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DynamicEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2459:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2460:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2460:2: ( RULE_ID )
            // InternalSceneDl.g:2461:3: RULE_ID
            {
             before(grammarAccess.getDynamicEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__NameAssignment_1"


    // $ANTLR start "rule__DynamicEntity__KeyAssignment_2_1"
    // InternalSceneDl.g:2470:1: rule__DynamicEntity__KeyAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicEntity__KeyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2474:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2475:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2475:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2476:3: ( RULE_ID )
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyAttributeCrossReference_2_1_0()); 
            // InternalSceneDl.g:2477:3: ( RULE_ID )
            // InternalSceneDl.g:2478:4: RULE_ID
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getKeyAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDynamicEntityAccess().getKeyAttributeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__KeyAssignment_2_1"


    // $ANTLR start "rule__DynamicEntity__IsAAssignment_3_1"
    // InternalSceneDl.g:2489:1: rule__DynamicEntity__IsAAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicEntity__IsAAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2493:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2494:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2494:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2495:3: ( RULE_ID )
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAElementCrossReference_3_1_0()); 
            // InternalSceneDl.g:2496:3: ( RULE_ID )
            // InternalSceneDl.g:2497:4: RULE_ID
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAElementIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getIsAElementIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDynamicEntityAccess().getIsAElementCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__IsAAssignment_3_1"


    // $ANTLR start "rule__DynamicEntity__AttributesAssignment_4_1_0"
    // InternalSceneDl.g:2508:1: rule__DynamicEntity__AttributesAssignment_4_1_0 : ( ruleAttribute ) ;
    public final void rule__DynamicEntity__AttributesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2512:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2513:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2513:2: ( ruleAttribute )
            // InternalSceneDl.g:2514:3: ruleAttribute
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__AttributesAssignment_4_1_0"


    // $ANTLR start "rule__DynamicEntity__ContainsAssignment_4_1_1"
    // InternalSceneDl.g:2523:1: rule__DynamicEntity__ContainsAssignment_4_1_1 : ( ruleContain ) ;
    public final void rule__DynamicEntity__ContainsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2527:1: ( ( ruleContain ) )
            // InternalSceneDl.g:2528:2: ( ruleContain )
            {
            // InternalSceneDl.g:2528:2: ( ruleContain )
            // InternalSceneDl.g:2529:3: ruleContain
            {
             before(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContain();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__ContainsAssignment_4_1_1"


    // $ANTLR start "rule__DynamicEntity__AttributesAssignment_4_2_0_1"
    // InternalSceneDl.g:2538:1: rule__DynamicEntity__AttributesAssignment_4_2_0_1 : ( ruleAttribute ) ;
    public final void rule__DynamicEntity__AttributesAssignment_4_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2542:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2543:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2543:2: ( ruleAttribute )
            // InternalSceneDl.g:2544:3: ruleAttribute
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__AttributesAssignment_4_2_0_1"


    // $ANTLR start "rule__DynamicEntity__ContainsAssignment_4_2_1_1"
    // InternalSceneDl.g:2553:1: rule__DynamicEntity__ContainsAssignment_4_2_1_1 : ( ruleContain ) ;
    public final void rule__DynamicEntity__ContainsAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2557:1: ( ( ruleContain ) )
            // InternalSceneDl.g:2558:2: ( ruleContain )
            {
            // InternalSceneDl.g:2558:2: ( ruleContain )
            // InternalSceneDl.g:2559:3: ruleContain
            {
             before(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContain();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicEntity__ContainsAssignment_4_2_1_1"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalSceneDl.g:2568:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2572:1: ( ( ( 'many' ) ) )
            // InternalSceneDl.g:2573:2: ( ( 'many' ) )
            {
            // InternalSceneDl.g:2573:2: ( ( 'many' ) )
            // InternalSceneDl.g:2574:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalSceneDl.g:2575:3: ( 'many' )
            // InternalSceneDl.g:2576:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalSceneDl.g:2587:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2591:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2592:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2592:2: ( RULE_ID )
            // InternalSceneDl.g:2593:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalSceneDl.g:2602:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2606:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2607:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2607:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2608:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeElementCrossReference_3_0()); 
            // InternalSceneDl.g:2609:3: ( RULE_ID )
            // InternalSceneDl.g:2610:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getTypeElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Contain__ManyAssignment_0"
    // InternalSceneDl.g:2621:1: rule__Contain__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Contain__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2625:1: ( ( ( 'many' ) ) )
            // InternalSceneDl.g:2626:2: ( ( 'many' ) )
            {
            // InternalSceneDl.g:2626:2: ( ( 'many' ) )
            // InternalSceneDl.g:2627:3: ( 'many' )
            {
             before(grammarAccess.getContainAccess().getManyManyKeyword_0_0()); 
            // InternalSceneDl.g:2628:3: ( 'many' )
            // InternalSceneDl.g:2629:4: 'many'
            {
             before(grammarAccess.getContainAccess().getManyManyKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContainAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getContainAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__ManyAssignment_0"


    // $ANTLR start "rule__Contain__NameAssignment_1"
    // InternalSceneDl.g:2640:1: rule__Contain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Contain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2644:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2645:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2645:2: ( RULE_ID )
            // InternalSceneDl.g:2646:3: RULE_ID
            {
             before(grammarAccess.getContainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__NameAssignment_1"


    // $ANTLR start "rule__Contain__TypeAssignment_3"
    // InternalSceneDl.g:2655:1: rule__Contain__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Contain__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2659:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2660:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2660:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2661:3: ( RULE_ID )
            {
             before(grammarAccess.getContainAccess().getTypeDynamicEntityCrossReference_3_0()); 
            // InternalSceneDl.g:2662:3: ( RULE_ID )
            // InternalSceneDl.g:2663:4: RULE_ID
            {
             before(grammarAccess.getContainAccess().getTypeDynamicEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainAccess().getTypeDynamicEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getContainAccess().getTypeDynamicEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contain__TypeAssignment_3"


    // $ANTLR start "rule__RegularAttribute__NameAssignment_0"
    // InternalSceneDl.g:2674:1: rule__RegularAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RegularAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2678:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2679:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2679:2: ( RULE_ID )
            // InternalSceneDl.g:2680:3: RULE_ID
            {
             before(grammarAccess.getRegularAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegularAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__NameAssignment_0"


    // $ANTLR start "rule__RegularAttribute__TypeAssignment_2"
    // InternalSceneDl.g:2689:1: rule__RegularAttribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__RegularAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2693:1: ( ( ruleAttributeType ) )
            // InternalSceneDl.g:2694:2: ( ruleAttributeType )
            {
            // InternalSceneDl.g:2694:2: ( ruleAttributeType )
            // InternalSceneDl.g:2695:3: ruleAttributeType
            {
             before(grammarAccess.getRegularAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getRegularAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__TypeAssignment_2"


    // $ANTLR start "rule__RegularAttribute__ValueAssignment_4"
    // InternalSceneDl.g:2704:1: rule__RegularAttribute__ValueAssignment_4 : ( ruleAttributeValue ) ;
    public final void rule__RegularAttribute__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2708:1: ( ( ruleAttributeValue ) )
            // InternalSceneDl.g:2709:2: ( ruleAttributeValue )
            {
            // InternalSceneDl.g:2709:2: ( ruleAttributeValue )
            // InternalSceneDl.g:2710:3: ruleAttributeValue
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__ValueAssignment_4"


    // $ANTLR start "rule__RegularAttribute__ValueAssignment_5_1"
    // InternalSceneDl.g:2719:1: rule__RegularAttribute__ValueAssignment_5_1 : ( ruleAttributeValue ) ;
    public final void rule__RegularAttribute__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2723:1: ( ( ruleAttributeValue ) )
            // InternalSceneDl.g:2724:2: ( ruleAttributeValue )
            {
            // InternalSceneDl.g:2724:2: ( ruleAttributeValue )
            // InternalSceneDl.g:2725:3: ruleAttributeValue
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__ValueAssignment_5_1"


    // $ANTLR start "rule__RegularAttribute__IsTransientAssignment_7"
    // InternalSceneDl.g:2734:1: rule__RegularAttribute__IsTransientAssignment_7 : ( ( 'transient' ) ) ;
    public final void rule__RegularAttribute__IsTransientAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2738:1: ( ( ( 'transient' ) ) )
            // InternalSceneDl.g:2739:2: ( ( 'transient' ) )
            {
            // InternalSceneDl.g:2739:2: ( ( 'transient' ) )
            // InternalSceneDl.g:2740:3: ( 'transient' )
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 
            // InternalSceneDl.g:2741:3: ( 'transient' )
            // InternalSceneDl.g:2742:4: 'transient'
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 

            }

             after(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularAttribute__IsTransientAssignment_7"


    // $ANTLR start "rule__PositionAttribute__NameAssignment_0"
    // InternalSceneDl.g:2753:1: rule__PositionAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PositionAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2757:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2758:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2758:2: ( RULE_ID )
            // InternalSceneDl.g:2759:3: RULE_ID
            {
             before(grammarAccess.getPositionAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__NameAssignment_0"


    // $ANTLR start "rule__PositionAttribute__TypeAssignment_2"
    // InternalSceneDl.g:2768:1: rule__PositionAttribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__PositionAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2772:1: ( ( ruleAttributeType ) )
            // InternalSceneDl.g:2773:2: ( ruleAttributeType )
            {
            // InternalSceneDl.g:2773:2: ( ruleAttributeType )
            // InternalSceneDl.g:2774:3: ruleAttributeType
            {
             before(grammarAccess.getPositionAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getPositionAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__TypeAssignment_2"


    // $ANTLR start "rule__PositionAttribute__XAssignment_4"
    // InternalSceneDl.g:2783:1: rule__PositionAttribute__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__PositionAttribute__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2787:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2788:2: ( RULE_INT )
            {
            // InternalSceneDl.g:2788:2: ( RULE_INT )
            // InternalSceneDl.g:2789:3: RULE_INT
            {
             before(grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__XAssignment_4"


    // $ANTLR start "rule__PositionAttribute__YAssignment_6"
    // InternalSceneDl.g:2798:1: rule__PositionAttribute__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__PositionAttribute__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2802:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2803:2: ( RULE_INT )
            {
            // InternalSceneDl.g:2803:2: ( RULE_INT )
            // InternalSceneDl.g:2804:3: RULE_INT
            {
             before(grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__YAssignment_6"


    // $ANTLR start "rule__PositionAttribute__IsTransientAssignment_8"
    // InternalSceneDl.g:2813:1: rule__PositionAttribute__IsTransientAssignment_8 : ( ( 'transient' ) ) ;
    public final void rule__PositionAttribute__IsTransientAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2817:1: ( ( ( 'transient' ) ) )
            // InternalSceneDl.g:2818:2: ( ( 'transient' ) )
            {
            // InternalSceneDl.g:2818:2: ( ( 'transient' ) )
            // InternalSceneDl.g:2819:3: ( 'transient' )
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 
            // InternalSceneDl.g:2820:3: ( 'transient' )
            // InternalSceneDl.g:2821:4: 'transient'
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 

            }

             after(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionAttribute__IsTransientAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});

}