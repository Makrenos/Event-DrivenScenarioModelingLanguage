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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'range'", "'value'", "'key'", "'isA'", "'{'", "'}'", "','", "':'", "'['", "']'", "'-'", "';'", "'.'", "'static_entity'", "'dynamic_entity'", "'transient'"
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSceneDl.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:154:1: ( ruleAttribute EOF )
            // InternalSceneDl.g:155:1: ruleAttribute EOF
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
    // InternalSceneDl.g:162:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:166:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalSceneDl.g:167:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalSceneDl.g:167:2: ( ( rule__Attribute__Alternatives ) )
            // InternalSceneDl.g:168:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalSceneDl.g:169:3: ( rule__Attribute__Alternatives )
            // InternalSceneDl.g:169:4: rule__Attribute__Alternatives
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
    // InternalSceneDl.g:178:1: entryRuleRegularAttribute : ruleRegularAttribute EOF ;
    public final void entryRuleRegularAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:179:1: ( ruleRegularAttribute EOF )
            // InternalSceneDl.g:180:1: ruleRegularAttribute EOF
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
    // InternalSceneDl.g:187:1: ruleRegularAttribute : ( ( rule__RegularAttribute__Group__0 ) ) ;
    public final void ruleRegularAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:191:2: ( ( ( rule__RegularAttribute__Group__0 ) ) )
            // InternalSceneDl.g:192:2: ( ( rule__RegularAttribute__Group__0 ) )
            {
            // InternalSceneDl.g:192:2: ( ( rule__RegularAttribute__Group__0 ) )
            // InternalSceneDl.g:193:3: ( rule__RegularAttribute__Group__0 )
            {
             before(grammarAccess.getRegularAttributeAccess().getGroup()); 
            // InternalSceneDl.g:194:3: ( rule__RegularAttribute__Group__0 )
            // InternalSceneDl.g:194:4: rule__RegularAttribute__Group__0
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
    // InternalSceneDl.g:203:1: entryRulePositionAttribute : rulePositionAttribute EOF ;
    public final void entryRulePositionAttribute() throws RecognitionException {
        try {
            // InternalSceneDl.g:204:1: ( rulePositionAttribute EOF )
            // InternalSceneDl.g:205:1: rulePositionAttribute EOF
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
    // InternalSceneDl.g:212:1: rulePositionAttribute : ( ( rule__PositionAttribute__Group__0 ) ) ;
    public final void rulePositionAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:216:2: ( ( ( rule__PositionAttribute__Group__0 ) ) )
            // InternalSceneDl.g:217:2: ( ( rule__PositionAttribute__Group__0 ) )
            {
            // InternalSceneDl.g:217:2: ( ( rule__PositionAttribute__Group__0 ) )
            // InternalSceneDl.g:218:3: ( rule__PositionAttribute__Group__0 )
            {
             before(grammarAccess.getPositionAttributeAccess().getGroup()); 
            // InternalSceneDl.g:219:3: ( rule__PositionAttribute__Group__0 )
            // InternalSceneDl.g:219:4: rule__PositionAttribute__Group__0
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
    // InternalSceneDl.g:228:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalSceneDl.g:229:1: ( ruleAttributeValue EOF )
            // InternalSceneDl.g:230:1: ruleAttributeValue EOF
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
    // InternalSceneDl.g:237:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:241:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // InternalSceneDl.g:242:2: ( ( rule__AttributeValue__Alternatives ) )
            {
            // InternalSceneDl.g:242:2: ( ( rule__AttributeValue__Alternatives ) )
            // InternalSceneDl.g:243:3: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // InternalSceneDl.g:244:3: ( rule__AttributeValue__Alternatives )
            // InternalSceneDl.g:244:4: rule__AttributeValue__Alternatives
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
    // InternalSceneDl.g:253:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:257:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalSceneDl.g:258:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalSceneDl.g:258:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalSceneDl.g:259:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalSceneDl.g:260:3: ( rule__AttributeType__Alternatives )
            // InternalSceneDl.g:260:4: rule__AttributeType__Alternatives
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
    // InternalSceneDl.g:268:1: rule__Element__Alternatives : ( ( ruleStaticEntity ) | ( ruleDynamicEntity ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:272:1: ( ( ruleStaticEntity ) | ( ruleDynamicEntity ) )
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
                    // InternalSceneDl.g:273:2: ( ruleStaticEntity )
                    {
                    // InternalSceneDl.g:273:2: ( ruleStaticEntity )
                    // InternalSceneDl.g:274:3: ruleStaticEntity
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
                    // InternalSceneDl.g:279:2: ( ruleDynamicEntity )
                    {
                    // InternalSceneDl.g:279:2: ( ruleDynamicEntity )
                    // InternalSceneDl.g:280:3: ruleDynamicEntity
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
    // InternalSceneDl.g:289:1: rule__StaticEntity__Alternatives_4_1 : ( ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) ) );
    public final void rule__StaticEntity__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:293:1: ( ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) ) | ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSceneDl.g:294:2: ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) )
                    {
                    // InternalSceneDl.g:294:2: ( ( rule__StaticEntity__AttributesAssignment_4_1_0 ) )
                    // InternalSceneDl.g:295:3: ( rule__StaticEntity__AttributesAssignment_4_1_0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_1_0()); 
                    // InternalSceneDl.g:296:3: ( rule__StaticEntity__AttributesAssignment_4_1_0 )
                    // InternalSceneDl.g:296:4: rule__StaticEntity__AttributesAssignment_4_1_0
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
                    // InternalSceneDl.g:300:2: ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) )
                    {
                    // InternalSceneDl.g:300:2: ( ( rule__StaticEntity__FeaturesAssignment_4_1_1 ) )
                    // InternalSceneDl.g:301:3: ( rule__StaticEntity__FeaturesAssignment_4_1_1 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_1_1()); 
                    // InternalSceneDl.g:302:3: ( rule__StaticEntity__FeaturesAssignment_4_1_1 )
                    // InternalSceneDl.g:302:4: rule__StaticEntity__FeaturesAssignment_4_1_1
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
    // InternalSceneDl.g:310:1: rule__StaticEntity__Alternatives_4_2 : ( ( ( rule__StaticEntity__Group_4_2_0__0 ) ) | ( ( rule__StaticEntity__Group_4_2_1__0 ) ) );
    public final void rule__StaticEntity__Alternatives_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:314:1: ( ( ( rule__StaticEntity__Group_4_2_0__0 ) ) | ( ( rule__StaticEntity__Group_4_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==18) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_2>=16 && LA3_2<=17)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

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
                    // InternalSceneDl.g:315:2: ( ( rule__StaticEntity__Group_4_2_0__0 ) )
                    {
                    // InternalSceneDl.g:315:2: ( ( rule__StaticEntity__Group_4_2_0__0 ) )
                    // InternalSceneDl.g:316:3: ( rule__StaticEntity__Group_4_2_0__0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getGroup_4_2_0()); 
                    // InternalSceneDl.g:317:3: ( rule__StaticEntity__Group_4_2_0__0 )
                    // InternalSceneDl.g:317:4: rule__StaticEntity__Group_4_2_0__0
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
                    // InternalSceneDl.g:321:2: ( ( rule__StaticEntity__Group_4_2_1__0 ) )
                    {
                    // InternalSceneDl.g:321:2: ( ( rule__StaticEntity__Group_4_2_1__0 ) )
                    // InternalSceneDl.g:322:3: ( rule__StaticEntity__Group_4_2_1__0 )
                    {
                     before(grammarAccess.getStaticEntityAccess().getGroup_4_2_1()); 
                    // InternalSceneDl.g:323:3: ( rule__StaticEntity__Group_4_2_1__0 )
                    // InternalSceneDl.g:323:4: rule__StaticEntity__Group_4_2_1__0
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


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalSceneDl.g:331:1: rule__Attribute__Alternatives : ( ( ruleRegularAttribute ) | ( rulePositionAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:335:1: ( ( ruleRegularAttribute ) | ( rulePositionAttribute ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==18) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==11) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==19) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==RULE_INT) ) {
                                int LA4_7 = input.LA(6);

                                if ( (LA4_7==EOF||(LA4_7>=16 && LA4_7<=17)||(LA4_7>=20 && LA4_7<=21)||LA4_7==23||LA4_7==26) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_7==22) ) {
                                    alt4=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA4_5==RULE_STRING) ) {
                                alt4=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA4_3>=RULE_INT && LA4_3<=RULE_STRING)) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_2==12) ) {
                        int LA4_4 = input.LA(4);

                        if ( (LA4_4==19) ) {
                            int LA4_5 = input.LA(5);

                            if ( (LA4_5==RULE_INT) ) {
                                int LA4_7 = input.LA(6);

                                if ( (LA4_7==EOF||(LA4_7>=16 && LA4_7<=17)||(LA4_7>=20 && LA4_7<=21)||LA4_7==23||LA4_7==26) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_7==22) ) {
                                    alt4=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA4_5==RULE_STRING) ) {
                                alt4=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA4_4>=RULE_INT && LA4_4<=RULE_STRING)) ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSceneDl.g:336:2: ( ruleRegularAttribute )
                    {
                    // InternalSceneDl.g:336:2: ( ruleRegularAttribute )
                    // InternalSceneDl.g:337:3: ruleRegularAttribute
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
                    // InternalSceneDl.g:342:2: ( rulePositionAttribute )
                    {
                    // InternalSceneDl.g:342:2: ( rulePositionAttribute )
                    // InternalSceneDl.g:343:3: rulePositionAttribute
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
    // InternalSceneDl.g:352:1: rule__AttributeValue__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( ( rule__AttributeValue__Group_2__0 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:356:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( ( rule__AttributeValue__Group_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=3;
                }
                else if ( (LA5_1==EOF||(LA5_1>=16 && LA5_1<=17)||(LA5_1>=20 && LA5_1<=21)||LA5_1==26) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSceneDl.g:357:2: ( RULE_INT )
                    {
                    // InternalSceneDl.g:357:2: ( RULE_INT )
                    // InternalSceneDl.g:358:3: RULE_INT
                    {
                     before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:363:2: ( RULE_STRING )
                    {
                    // InternalSceneDl.g:363:2: ( RULE_STRING )
                    // InternalSceneDl.g:364:3: RULE_STRING
                    {
                     before(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSceneDl.g:369:2: ( ( rule__AttributeValue__Group_2__0 ) )
                    {
                    // InternalSceneDl.g:369:2: ( ( rule__AttributeValue__Group_2__0 ) )
                    // InternalSceneDl.g:370:3: ( rule__AttributeValue__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getGroup_2()); 
                    // InternalSceneDl.g:371:3: ( rule__AttributeValue__Group_2__0 )
                    // InternalSceneDl.g:371:4: rule__AttributeValue__Group_2__0
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
    // InternalSceneDl.g:379:1: rule__AttributeType__Alternatives : ( ( ( 'range' ) ) | ( ( 'value' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:383:1: ( ( ( 'range' ) ) | ( ( 'value' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSceneDl.g:384:2: ( ( 'range' ) )
                    {
                    // InternalSceneDl.g:384:2: ( ( 'range' ) )
                    // InternalSceneDl.g:385:3: ( 'range' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0()); 
                    // InternalSceneDl.g:386:3: ( 'range' )
                    // InternalSceneDl.g:386:4: 'range'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:390:2: ( ( 'value' ) )
                    {
                    // InternalSceneDl.g:390:2: ( ( 'value' ) )
                    // InternalSceneDl.g:391:3: ( 'value' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1()); 
                    // InternalSceneDl.g:392:3: ( 'value' )
                    // InternalSceneDl.g:392:4: 'value'
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
    // InternalSceneDl.g:400:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:404:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalSceneDl.g:405:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalSceneDl.g:412:1: rule__Scene__Group__0__Impl : ( ( rule__Scene__NameAssignment_0 ) ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:416:1: ( ( ( rule__Scene__NameAssignment_0 ) ) )
            // InternalSceneDl.g:417:1: ( ( rule__Scene__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:417:1: ( ( rule__Scene__NameAssignment_0 ) )
            // InternalSceneDl.g:418:2: ( rule__Scene__NameAssignment_0 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:419:2: ( rule__Scene__NameAssignment_0 )
            // InternalSceneDl.g:419:3: rule__Scene__NameAssignment_0
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
    // InternalSceneDl.g:427:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:431:1: ( rule__Scene__Group__1__Impl )
            // InternalSceneDl.g:432:2: rule__Scene__Group__1__Impl
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
    // InternalSceneDl.g:438:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__ElementsAssignment_1 )* ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:442:1: ( ( ( rule__Scene__ElementsAssignment_1 )* ) )
            // InternalSceneDl.g:443:1: ( ( rule__Scene__ElementsAssignment_1 )* )
            {
            // InternalSceneDl.g:443:1: ( ( rule__Scene__ElementsAssignment_1 )* )
            // InternalSceneDl.g:444:2: ( rule__Scene__ElementsAssignment_1 )*
            {
             before(grammarAccess.getSceneAccess().getElementsAssignment_1()); 
            // InternalSceneDl.g:445:2: ( rule__Scene__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSceneDl.g:445:3: rule__Scene__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scene__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalSceneDl.g:454:1: rule__StaticEntity__Group__0 : rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1 ;
    public final void rule__StaticEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:458:1: ( rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1 )
            // InternalSceneDl.g:459:2: rule__StaticEntity__Group__0__Impl rule__StaticEntity__Group__1
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
    // InternalSceneDl.g:466:1: rule__StaticEntity__Group__0__Impl : ( ( rule__StaticEntity__TypeAssignment_0 ) ) ;
    public final void rule__StaticEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:470:1: ( ( ( rule__StaticEntity__TypeAssignment_0 ) ) )
            // InternalSceneDl.g:471:1: ( ( rule__StaticEntity__TypeAssignment_0 ) )
            {
            // InternalSceneDl.g:471:1: ( ( rule__StaticEntity__TypeAssignment_0 ) )
            // InternalSceneDl.g:472:2: ( rule__StaticEntity__TypeAssignment_0 )
            {
             before(grammarAccess.getStaticEntityAccess().getTypeAssignment_0()); 
            // InternalSceneDl.g:473:2: ( rule__StaticEntity__TypeAssignment_0 )
            // InternalSceneDl.g:473:3: rule__StaticEntity__TypeAssignment_0
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
    // InternalSceneDl.g:481:1: rule__StaticEntity__Group__1 : rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2 ;
    public final void rule__StaticEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:485:1: ( rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2 )
            // InternalSceneDl.g:486:2: rule__StaticEntity__Group__1__Impl rule__StaticEntity__Group__2
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
    // InternalSceneDl.g:493:1: rule__StaticEntity__Group__1__Impl : ( ( rule__StaticEntity__NameAssignment_1 ) ) ;
    public final void rule__StaticEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:497:1: ( ( ( rule__StaticEntity__NameAssignment_1 ) ) )
            // InternalSceneDl.g:498:1: ( ( rule__StaticEntity__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:498:1: ( ( rule__StaticEntity__NameAssignment_1 ) )
            // InternalSceneDl.g:499:2: ( rule__StaticEntity__NameAssignment_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:500:2: ( rule__StaticEntity__NameAssignment_1 )
            // InternalSceneDl.g:500:3: rule__StaticEntity__NameAssignment_1
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
    // InternalSceneDl.g:508:1: rule__StaticEntity__Group__2 : rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3 ;
    public final void rule__StaticEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:512:1: ( rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3 )
            // InternalSceneDl.g:513:2: rule__StaticEntity__Group__2__Impl rule__StaticEntity__Group__3
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
    // InternalSceneDl.g:520:1: rule__StaticEntity__Group__2__Impl : ( ( rule__StaticEntity__Group_2__0 )? ) ;
    public final void rule__StaticEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:524:1: ( ( ( rule__StaticEntity__Group_2__0 )? ) )
            // InternalSceneDl.g:525:1: ( ( rule__StaticEntity__Group_2__0 )? )
            {
            // InternalSceneDl.g:525:1: ( ( rule__StaticEntity__Group_2__0 )? )
            // InternalSceneDl.g:526:2: ( rule__StaticEntity__Group_2__0 )?
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_2()); 
            // InternalSceneDl.g:527:2: ( rule__StaticEntity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDl.g:527:3: rule__StaticEntity__Group_2__0
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
    // InternalSceneDl.g:535:1: rule__StaticEntity__Group__3 : rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4 ;
    public final void rule__StaticEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:539:1: ( rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4 )
            // InternalSceneDl.g:540:2: rule__StaticEntity__Group__3__Impl rule__StaticEntity__Group__4
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
    // InternalSceneDl.g:547:1: rule__StaticEntity__Group__3__Impl : ( ( rule__StaticEntity__Group_3__0 )* ) ;
    public final void rule__StaticEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:551:1: ( ( ( rule__StaticEntity__Group_3__0 )* ) )
            // InternalSceneDl.g:552:1: ( ( rule__StaticEntity__Group_3__0 )* )
            {
            // InternalSceneDl.g:552:1: ( ( rule__StaticEntity__Group_3__0 )* )
            // InternalSceneDl.g:553:2: ( rule__StaticEntity__Group_3__0 )*
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_3()); 
            // InternalSceneDl.g:554:2: ( rule__StaticEntity__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSceneDl.g:554:3: rule__StaticEntity__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StaticEntity__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSceneDl.g:562:1: rule__StaticEntity__Group__4 : rule__StaticEntity__Group__4__Impl ;
    public final void rule__StaticEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:566:1: ( rule__StaticEntity__Group__4__Impl )
            // InternalSceneDl.g:567:2: rule__StaticEntity__Group__4__Impl
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
    // InternalSceneDl.g:573:1: rule__StaticEntity__Group__4__Impl : ( ( rule__StaticEntity__Group_4__0 )? ) ;
    public final void rule__StaticEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:577:1: ( ( ( rule__StaticEntity__Group_4__0 )? ) )
            // InternalSceneDl.g:578:1: ( ( rule__StaticEntity__Group_4__0 )? )
            {
            // InternalSceneDl.g:578:1: ( ( rule__StaticEntity__Group_4__0 )? )
            // InternalSceneDl.g:579:2: ( rule__StaticEntity__Group_4__0 )?
            {
             before(grammarAccess.getStaticEntityAccess().getGroup_4()); 
            // InternalSceneDl.g:580:2: ( rule__StaticEntity__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSceneDl.g:580:3: rule__StaticEntity__Group_4__0
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
    // InternalSceneDl.g:589:1: rule__StaticEntity__Group_2__0 : rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1 ;
    public final void rule__StaticEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:593:1: ( rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1 )
            // InternalSceneDl.g:594:2: rule__StaticEntity__Group_2__0__Impl rule__StaticEntity__Group_2__1
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
    // InternalSceneDl.g:601:1: rule__StaticEntity__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__StaticEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:605:1: ( ( 'key' ) )
            // InternalSceneDl.g:606:1: ( 'key' )
            {
            // InternalSceneDl.g:606:1: ( 'key' )
            // InternalSceneDl.g:607:2: 'key'
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
    // InternalSceneDl.g:616:1: rule__StaticEntity__Group_2__1 : rule__StaticEntity__Group_2__1__Impl ;
    public final void rule__StaticEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:620:1: ( rule__StaticEntity__Group_2__1__Impl )
            // InternalSceneDl.g:621:2: rule__StaticEntity__Group_2__1__Impl
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
    // InternalSceneDl.g:627:1: rule__StaticEntity__Group_2__1__Impl : ( ( rule__StaticEntity__KeyAssignment_2_1 ) ) ;
    public final void rule__StaticEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:631:1: ( ( ( rule__StaticEntity__KeyAssignment_2_1 ) ) )
            // InternalSceneDl.g:632:1: ( ( rule__StaticEntity__KeyAssignment_2_1 ) )
            {
            // InternalSceneDl.g:632:1: ( ( rule__StaticEntity__KeyAssignment_2_1 ) )
            // InternalSceneDl.g:633:2: ( rule__StaticEntity__KeyAssignment_2_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getKeyAssignment_2_1()); 
            // InternalSceneDl.g:634:2: ( rule__StaticEntity__KeyAssignment_2_1 )
            // InternalSceneDl.g:634:3: rule__StaticEntity__KeyAssignment_2_1
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
    // InternalSceneDl.g:643:1: rule__StaticEntity__Group_3__0 : rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1 ;
    public final void rule__StaticEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:647:1: ( rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1 )
            // InternalSceneDl.g:648:2: rule__StaticEntity__Group_3__0__Impl rule__StaticEntity__Group_3__1
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
    // InternalSceneDl.g:655:1: rule__StaticEntity__Group_3__0__Impl : ( 'isA' ) ;
    public final void rule__StaticEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:659:1: ( ( 'isA' ) )
            // InternalSceneDl.g:660:1: ( 'isA' )
            {
            // InternalSceneDl.g:660:1: ( 'isA' )
            // InternalSceneDl.g:661:2: 'isA'
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
    // InternalSceneDl.g:670:1: rule__StaticEntity__Group_3__1 : rule__StaticEntity__Group_3__1__Impl ;
    public final void rule__StaticEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:674:1: ( rule__StaticEntity__Group_3__1__Impl )
            // InternalSceneDl.g:675:2: rule__StaticEntity__Group_3__1__Impl
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
    // InternalSceneDl.g:681:1: rule__StaticEntity__Group_3__1__Impl : ( ( rule__StaticEntity__IsAAssignment_3_1 ) ) ;
    public final void rule__StaticEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:685:1: ( ( ( rule__StaticEntity__IsAAssignment_3_1 ) ) )
            // InternalSceneDl.g:686:1: ( ( rule__StaticEntity__IsAAssignment_3_1 ) )
            {
            // InternalSceneDl.g:686:1: ( ( rule__StaticEntity__IsAAssignment_3_1 ) )
            // InternalSceneDl.g:687:2: ( rule__StaticEntity__IsAAssignment_3_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getIsAAssignment_3_1()); 
            // InternalSceneDl.g:688:2: ( rule__StaticEntity__IsAAssignment_3_1 )
            // InternalSceneDl.g:688:3: rule__StaticEntity__IsAAssignment_3_1
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
    // InternalSceneDl.g:697:1: rule__StaticEntity__Group_4__0 : rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1 ;
    public final void rule__StaticEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:701:1: ( rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1 )
            // InternalSceneDl.g:702:2: rule__StaticEntity__Group_4__0__Impl rule__StaticEntity__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSceneDl.g:709:1: rule__StaticEntity__Group_4__0__Impl : ( '{' ) ;
    public final void rule__StaticEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:713:1: ( ( '{' ) )
            // InternalSceneDl.g:714:1: ( '{' )
            {
            // InternalSceneDl.g:714:1: ( '{' )
            // InternalSceneDl.g:715:2: '{'
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
    // InternalSceneDl.g:724:1: rule__StaticEntity__Group_4__1 : rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2 ;
    public final void rule__StaticEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:728:1: ( rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2 )
            // InternalSceneDl.g:729:2: rule__StaticEntity__Group_4__1__Impl rule__StaticEntity__Group_4__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSceneDl.g:736:1: rule__StaticEntity__Group_4__1__Impl : ( ( rule__StaticEntity__Alternatives_4_1 ) ) ;
    public final void rule__StaticEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:740:1: ( ( ( rule__StaticEntity__Alternatives_4_1 ) ) )
            // InternalSceneDl.g:741:1: ( ( rule__StaticEntity__Alternatives_4_1 ) )
            {
            // InternalSceneDl.g:741:1: ( ( rule__StaticEntity__Alternatives_4_1 ) )
            // InternalSceneDl.g:742:2: ( rule__StaticEntity__Alternatives_4_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getAlternatives_4_1()); 
            // InternalSceneDl.g:743:2: ( rule__StaticEntity__Alternatives_4_1 )
            // InternalSceneDl.g:743:3: rule__StaticEntity__Alternatives_4_1
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
    // InternalSceneDl.g:751:1: rule__StaticEntity__Group_4__2 : rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3 ;
    public final void rule__StaticEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:755:1: ( rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3 )
            // InternalSceneDl.g:756:2: rule__StaticEntity__Group_4__2__Impl rule__StaticEntity__Group_4__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSceneDl.g:763:1: rule__StaticEntity__Group_4__2__Impl : ( ( rule__StaticEntity__Alternatives_4_2 )* ) ;
    public final void rule__StaticEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:767:1: ( ( ( rule__StaticEntity__Alternatives_4_2 )* ) )
            // InternalSceneDl.g:768:1: ( ( rule__StaticEntity__Alternatives_4_2 )* )
            {
            // InternalSceneDl.g:768:1: ( ( rule__StaticEntity__Alternatives_4_2 )* )
            // InternalSceneDl.g:769:2: ( rule__StaticEntity__Alternatives_4_2 )*
            {
             before(grammarAccess.getStaticEntityAccess().getAlternatives_4_2()); 
            // InternalSceneDl.g:770:2: ( rule__StaticEntity__Alternatives_4_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSceneDl.g:770:3: rule__StaticEntity__Alternatives_4_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__StaticEntity__Alternatives_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalSceneDl.g:778:1: rule__StaticEntity__Group_4__3 : rule__StaticEntity__Group_4__3__Impl ;
    public final void rule__StaticEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:782:1: ( rule__StaticEntity__Group_4__3__Impl )
            // InternalSceneDl.g:783:2: rule__StaticEntity__Group_4__3__Impl
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
    // InternalSceneDl.g:789:1: rule__StaticEntity__Group_4__3__Impl : ( '}' ) ;
    public final void rule__StaticEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:793:1: ( ( '}' ) )
            // InternalSceneDl.g:794:1: ( '}' )
            {
            // InternalSceneDl.g:794:1: ( '}' )
            // InternalSceneDl.g:795:2: '}'
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
    // InternalSceneDl.g:805:1: rule__StaticEntity__Group_4_2_0__0 : rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1 ;
    public final void rule__StaticEntity__Group_4_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:809:1: ( rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1 )
            // InternalSceneDl.g:810:2: rule__StaticEntity__Group_4_2_0__0__Impl rule__StaticEntity__Group_4_2_0__1
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
    // InternalSceneDl.g:817:1: rule__StaticEntity__Group_4_2_0__0__Impl : ( ',' ) ;
    public final void rule__StaticEntity__Group_4_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:821:1: ( ( ',' ) )
            // InternalSceneDl.g:822:1: ( ',' )
            {
            // InternalSceneDl.g:822:1: ( ',' )
            // InternalSceneDl.g:823:2: ','
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
    // InternalSceneDl.g:832:1: rule__StaticEntity__Group_4_2_0__1 : rule__StaticEntity__Group_4_2_0__1__Impl ;
    public final void rule__StaticEntity__Group_4_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:836:1: ( rule__StaticEntity__Group_4_2_0__1__Impl )
            // InternalSceneDl.g:837:2: rule__StaticEntity__Group_4_2_0__1__Impl
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
    // InternalSceneDl.g:843:1: rule__StaticEntity__Group_4_2_0__1__Impl : ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) ) ;
    public final void rule__StaticEntity__Group_4_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:847:1: ( ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) ) )
            // InternalSceneDl.g:848:1: ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) )
            {
            // InternalSceneDl.g:848:1: ( ( rule__StaticEntity__AttributesAssignment_4_2_0_1 ) )
            // InternalSceneDl.g:849:2: ( rule__StaticEntity__AttributesAssignment_4_2_0_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getAttributesAssignment_4_2_0_1()); 
            // InternalSceneDl.g:850:2: ( rule__StaticEntity__AttributesAssignment_4_2_0_1 )
            // InternalSceneDl.g:850:3: rule__StaticEntity__AttributesAssignment_4_2_0_1
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
    // InternalSceneDl.g:859:1: rule__StaticEntity__Group_4_2_1__0 : rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1 ;
    public final void rule__StaticEntity__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:863:1: ( rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1 )
            // InternalSceneDl.g:864:2: rule__StaticEntity__Group_4_2_1__0__Impl rule__StaticEntity__Group_4_2_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSceneDl.g:871:1: rule__StaticEntity__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__StaticEntity__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:875:1: ( ( ',' ) )
            // InternalSceneDl.g:876:1: ( ',' )
            {
            // InternalSceneDl.g:876:1: ( ',' )
            // InternalSceneDl.g:877:2: ','
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
    // InternalSceneDl.g:886:1: rule__StaticEntity__Group_4_2_1__1 : rule__StaticEntity__Group_4_2_1__1__Impl ;
    public final void rule__StaticEntity__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:890:1: ( rule__StaticEntity__Group_4_2_1__1__Impl )
            // InternalSceneDl.g:891:2: rule__StaticEntity__Group_4_2_1__1__Impl
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
    // InternalSceneDl.g:897:1: rule__StaticEntity__Group_4_2_1__1__Impl : ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) ) ;
    public final void rule__StaticEntity__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:901:1: ( ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) ) )
            // InternalSceneDl.g:902:1: ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) )
            {
            // InternalSceneDl.g:902:1: ( ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 ) )
            // InternalSceneDl.g:903:2: ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 )
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesAssignment_4_2_1_1()); 
            // InternalSceneDl.g:904:2: ( rule__StaticEntity__FeaturesAssignment_4_2_1_1 )
            // InternalSceneDl.g:904:3: rule__StaticEntity__FeaturesAssignment_4_2_1_1
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
    // InternalSceneDl.g:913:1: rule__DynamicEntity__Group__0 : rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1 ;
    public final void rule__DynamicEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:917:1: ( rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1 )
            // InternalSceneDl.g:918:2: rule__DynamicEntity__Group__0__Impl rule__DynamicEntity__Group__1
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
    // InternalSceneDl.g:925:1: rule__DynamicEntity__Group__0__Impl : ( ( rule__DynamicEntity__TypeAssignment_0 ) ) ;
    public final void rule__DynamicEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:929:1: ( ( ( rule__DynamicEntity__TypeAssignment_0 ) ) )
            // InternalSceneDl.g:930:1: ( ( rule__DynamicEntity__TypeAssignment_0 ) )
            {
            // InternalSceneDl.g:930:1: ( ( rule__DynamicEntity__TypeAssignment_0 ) )
            // InternalSceneDl.g:931:2: ( rule__DynamicEntity__TypeAssignment_0 )
            {
             before(grammarAccess.getDynamicEntityAccess().getTypeAssignment_0()); 
            // InternalSceneDl.g:932:2: ( rule__DynamicEntity__TypeAssignment_0 )
            // InternalSceneDl.g:932:3: rule__DynamicEntity__TypeAssignment_0
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
    // InternalSceneDl.g:940:1: rule__DynamicEntity__Group__1 : rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2 ;
    public final void rule__DynamicEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:944:1: ( rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2 )
            // InternalSceneDl.g:945:2: rule__DynamicEntity__Group__1__Impl rule__DynamicEntity__Group__2
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
    // InternalSceneDl.g:952:1: rule__DynamicEntity__Group__1__Impl : ( ( rule__DynamicEntity__NameAssignment_1 ) ) ;
    public final void rule__DynamicEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:956:1: ( ( ( rule__DynamicEntity__NameAssignment_1 ) ) )
            // InternalSceneDl.g:957:1: ( ( rule__DynamicEntity__NameAssignment_1 ) )
            {
            // InternalSceneDl.g:957:1: ( ( rule__DynamicEntity__NameAssignment_1 ) )
            // InternalSceneDl.g:958:2: ( rule__DynamicEntity__NameAssignment_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getNameAssignment_1()); 
            // InternalSceneDl.g:959:2: ( rule__DynamicEntity__NameAssignment_1 )
            // InternalSceneDl.g:959:3: rule__DynamicEntity__NameAssignment_1
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
    // InternalSceneDl.g:967:1: rule__DynamicEntity__Group__2 : rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3 ;
    public final void rule__DynamicEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:971:1: ( rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3 )
            // InternalSceneDl.g:972:2: rule__DynamicEntity__Group__2__Impl rule__DynamicEntity__Group__3
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
    // InternalSceneDl.g:979:1: rule__DynamicEntity__Group__2__Impl : ( ( rule__DynamicEntity__Group_2__0 )? ) ;
    public final void rule__DynamicEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:983:1: ( ( ( rule__DynamicEntity__Group_2__0 )? ) )
            // InternalSceneDl.g:984:1: ( ( rule__DynamicEntity__Group_2__0 )? )
            {
            // InternalSceneDl.g:984:1: ( ( rule__DynamicEntity__Group_2__0 )? )
            // InternalSceneDl.g:985:2: ( rule__DynamicEntity__Group_2__0 )?
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_2()); 
            // InternalSceneDl.g:986:2: ( rule__DynamicEntity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDl.g:986:3: rule__DynamicEntity__Group_2__0
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
    // InternalSceneDl.g:994:1: rule__DynamicEntity__Group__3 : rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4 ;
    public final void rule__DynamicEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:998:1: ( rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4 )
            // InternalSceneDl.g:999:2: rule__DynamicEntity__Group__3__Impl rule__DynamicEntity__Group__4
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
    // InternalSceneDl.g:1006:1: rule__DynamicEntity__Group__3__Impl : ( ( rule__DynamicEntity__Group_3__0 )* ) ;
    public final void rule__DynamicEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1010:1: ( ( ( rule__DynamicEntity__Group_3__0 )* ) )
            // InternalSceneDl.g:1011:1: ( ( rule__DynamicEntity__Group_3__0 )* )
            {
            // InternalSceneDl.g:1011:1: ( ( rule__DynamicEntity__Group_3__0 )* )
            // InternalSceneDl.g:1012:2: ( rule__DynamicEntity__Group_3__0 )*
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_3()); 
            // InternalSceneDl.g:1013:2: ( rule__DynamicEntity__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSceneDl.g:1013:3: rule__DynamicEntity__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DynamicEntity__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSceneDl.g:1021:1: rule__DynamicEntity__Group__4 : rule__DynamicEntity__Group__4__Impl ;
    public final void rule__DynamicEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1025:1: ( rule__DynamicEntity__Group__4__Impl )
            // InternalSceneDl.g:1026:2: rule__DynamicEntity__Group__4__Impl
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
    // InternalSceneDl.g:1032:1: rule__DynamicEntity__Group__4__Impl : ( ( rule__DynamicEntity__Group_4__0 )? ) ;
    public final void rule__DynamicEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1036:1: ( ( ( rule__DynamicEntity__Group_4__0 )? ) )
            // InternalSceneDl.g:1037:1: ( ( rule__DynamicEntity__Group_4__0 )? )
            {
            // InternalSceneDl.g:1037:1: ( ( rule__DynamicEntity__Group_4__0 )? )
            // InternalSceneDl.g:1038:2: ( rule__DynamicEntity__Group_4__0 )?
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_4()); 
            // InternalSceneDl.g:1039:2: ( rule__DynamicEntity__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDl.g:1039:3: rule__DynamicEntity__Group_4__0
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
    // InternalSceneDl.g:1048:1: rule__DynamicEntity__Group_2__0 : rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1 ;
    public final void rule__DynamicEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1052:1: ( rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1 )
            // InternalSceneDl.g:1053:2: rule__DynamicEntity__Group_2__0__Impl rule__DynamicEntity__Group_2__1
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
    // InternalSceneDl.g:1060:1: rule__DynamicEntity__Group_2__0__Impl : ( 'key' ) ;
    public final void rule__DynamicEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1064:1: ( ( 'key' ) )
            // InternalSceneDl.g:1065:1: ( 'key' )
            {
            // InternalSceneDl.g:1065:1: ( 'key' )
            // InternalSceneDl.g:1066:2: 'key'
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
    // InternalSceneDl.g:1075:1: rule__DynamicEntity__Group_2__1 : rule__DynamicEntity__Group_2__1__Impl ;
    public final void rule__DynamicEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1079:1: ( rule__DynamicEntity__Group_2__1__Impl )
            // InternalSceneDl.g:1080:2: rule__DynamicEntity__Group_2__1__Impl
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
    // InternalSceneDl.g:1086:1: rule__DynamicEntity__Group_2__1__Impl : ( ( rule__DynamicEntity__KeyAssignment_2_1 ) ) ;
    public final void rule__DynamicEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1090:1: ( ( ( rule__DynamicEntity__KeyAssignment_2_1 ) ) )
            // InternalSceneDl.g:1091:1: ( ( rule__DynamicEntity__KeyAssignment_2_1 ) )
            {
            // InternalSceneDl.g:1091:1: ( ( rule__DynamicEntity__KeyAssignment_2_1 ) )
            // InternalSceneDl.g:1092:2: ( rule__DynamicEntity__KeyAssignment_2_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyAssignment_2_1()); 
            // InternalSceneDl.g:1093:2: ( rule__DynamicEntity__KeyAssignment_2_1 )
            // InternalSceneDl.g:1093:3: rule__DynamicEntity__KeyAssignment_2_1
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
    // InternalSceneDl.g:1102:1: rule__DynamicEntity__Group_3__0 : rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1 ;
    public final void rule__DynamicEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1106:1: ( rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1 )
            // InternalSceneDl.g:1107:2: rule__DynamicEntity__Group_3__0__Impl rule__DynamicEntity__Group_3__1
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
    // InternalSceneDl.g:1114:1: rule__DynamicEntity__Group_3__0__Impl : ( 'isA' ) ;
    public final void rule__DynamicEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1118:1: ( ( 'isA' ) )
            // InternalSceneDl.g:1119:1: ( 'isA' )
            {
            // InternalSceneDl.g:1119:1: ( 'isA' )
            // InternalSceneDl.g:1120:2: 'isA'
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
    // InternalSceneDl.g:1129:1: rule__DynamicEntity__Group_3__1 : rule__DynamicEntity__Group_3__1__Impl ;
    public final void rule__DynamicEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1133:1: ( rule__DynamicEntity__Group_3__1__Impl )
            // InternalSceneDl.g:1134:2: rule__DynamicEntity__Group_3__1__Impl
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
    // InternalSceneDl.g:1140:1: rule__DynamicEntity__Group_3__1__Impl : ( ( rule__DynamicEntity__IsAAssignment_3_1 ) ) ;
    public final void rule__DynamicEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1144:1: ( ( ( rule__DynamicEntity__IsAAssignment_3_1 ) ) )
            // InternalSceneDl.g:1145:1: ( ( rule__DynamicEntity__IsAAssignment_3_1 ) )
            {
            // InternalSceneDl.g:1145:1: ( ( rule__DynamicEntity__IsAAssignment_3_1 ) )
            // InternalSceneDl.g:1146:2: ( rule__DynamicEntity__IsAAssignment_3_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAAssignment_3_1()); 
            // InternalSceneDl.g:1147:2: ( rule__DynamicEntity__IsAAssignment_3_1 )
            // InternalSceneDl.g:1147:3: rule__DynamicEntity__IsAAssignment_3_1
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
    // InternalSceneDl.g:1156:1: rule__DynamicEntity__Group_4__0 : rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1 ;
    public final void rule__DynamicEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1160:1: ( rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1 )
            // InternalSceneDl.g:1161:2: rule__DynamicEntity__Group_4__0__Impl rule__DynamicEntity__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSceneDl.g:1168:1: rule__DynamicEntity__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DynamicEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1172:1: ( ( '{' ) )
            // InternalSceneDl.g:1173:1: ( '{' )
            {
            // InternalSceneDl.g:1173:1: ( '{' )
            // InternalSceneDl.g:1174:2: '{'
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
    // InternalSceneDl.g:1183:1: rule__DynamicEntity__Group_4__1 : rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2 ;
    public final void rule__DynamicEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1187:1: ( rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2 )
            // InternalSceneDl.g:1188:2: rule__DynamicEntity__Group_4__1__Impl rule__DynamicEntity__Group_4__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSceneDl.g:1195:1: rule__DynamicEntity__Group_4__1__Impl : ( ( rule__DynamicEntity__AttributesAssignment_4_1 ) ) ;
    public final void rule__DynamicEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1199:1: ( ( ( rule__DynamicEntity__AttributesAssignment_4_1 ) ) )
            // InternalSceneDl.g:1200:1: ( ( rule__DynamicEntity__AttributesAssignment_4_1 ) )
            {
            // InternalSceneDl.g:1200:1: ( ( rule__DynamicEntity__AttributesAssignment_4_1 ) )
            // InternalSceneDl.g:1201:2: ( rule__DynamicEntity__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_1()); 
            // InternalSceneDl.g:1202:2: ( rule__DynamicEntity__AttributesAssignment_4_1 )
            // InternalSceneDl.g:1202:3: rule__DynamicEntity__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_1()); 

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
    // InternalSceneDl.g:1210:1: rule__DynamicEntity__Group_4__2 : rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3 ;
    public final void rule__DynamicEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1214:1: ( rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3 )
            // InternalSceneDl.g:1215:2: rule__DynamicEntity__Group_4__2__Impl rule__DynamicEntity__Group_4__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalSceneDl.g:1222:1: rule__DynamicEntity__Group_4__2__Impl : ( ( rule__DynamicEntity__Group_4_2__0 )* ) ;
    public final void rule__DynamicEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1226:1: ( ( ( rule__DynamicEntity__Group_4_2__0 )* ) )
            // InternalSceneDl.g:1227:1: ( ( rule__DynamicEntity__Group_4_2__0 )* )
            {
            // InternalSceneDl.g:1227:1: ( ( rule__DynamicEntity__Group_4_2__0 )* )
            // InternalSceneDl.g:1228:2: ( rule__DynamicEntity__Group_4_2__0 )*
            {
             before(grammarAccess.getDynamicEntityAccess().getGroup_4_2()); 
            // InternalSceneDl.g:1229:2: ( rule__DynamicEntity__Group_4_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSceneDl.g:1229:3: rule__DynamicEntity__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DynamicEntity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDynamicEntityAccess().getGroup_4_2()); 

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
    // InternalSceneDl.g:1237:1: rule__DynamicEntity__Group_4__3 : rule__DynamicEntity__Group_4__3__Impl ;
    public final void rule__DynamicEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1241:1: ( rule__DynamicEntity__Group_4__3__Impl )
            // InternalSceneDl.g:1242:2: rule__DynamicEntity__Group_4__3__Impl
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
    // InternalSceneDl.g:1248:1: rule__DynamicEntity__Group_4__3__Impl : ( '}' ) ;
    public final void rule__DynamicEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1252:1: ( ( '}' ) )
            // InternalSceneDl.g:1253:1: ( '}' )
            {
            // InternalSceneDl.g:1253:1: ( '}' )
            // InternalSceneDl.g:1254:2: '}'
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


    // $ANTLR start "rule__DynamicEntity__Group_4_2__0"
    // InternalSceneDl.g:1264:1: rule__DynamicEntity__Group_4_2__0 : rule__DynamicEntity__Group_4_2__0__Impl rule__DynamicEntity__Group_4_2__1 ;
    public final void rule__DynamicEntity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1268:1: ( rule__DynamicEntity__Group_4_2__0__Impl rule__DynamicEntity__Group_4_2__1 )
            // InternalSceneDl.g:1269:2: rule__DynamicEntity__Group_4_2__0__Impl rule__DynamicEntity__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DynamicEntity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2__1();

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
    // $ANTLR end "rule__DynamicEntity__Group_4_2__0"


    // $ANTLR start "rule__DynamicEntity__Group_4_2__0__Impl"
    // InternalSceneDl.g:1276:1: rule__DynamicEntity__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DynamicEntity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1280:1: ( ( ',' ) )
            // InternalSceneDl.g:1281:1: ( ',' )
            {
            // InternalSceneDl.g:1281:1: ( ',' )
            // InternalSceneDl.g:1282:2: ','
            {
             before(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__DynamicEntity__Group_4_2__0__Impl"


    // $ANTLR start "rule__DynamicEntity__Group_4_2__1"
    // InternalSceneDl.g:1291:1: rule__DynamicEntity__Group_4_2__1 : rule__DynamicEntity__Group_4_2__1__Impl ;
    public final void rule__DynamicEntity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1295:1: ( rule__DynamicEntity__Group_4_2__1__Impl )
            // InternalSceneDl.g:1296:2: rule__DynamicEntity__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__DynamicEntity__Group_4_2__1"


    // $ANTLR start "rule__DynamicEntity__Group_4_2__1__Impl"
    // InternalSceneDl.g:1302:1: rule__DynamicEntity__Group_4_2__1__Impl : ( ( rule__DynamicEntity__AttributesAssignment_4_2_1 ) ) ;
    public final void rule__DynamicEntity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1306:1: ( ( ( rule__DynamicEntity__AttributesAssignment_4_2_1 ) ) )
            // InternalSceneDl.g:1307:1: ( ( rule__DynamicEntity__AttributesAssignment_4_2_1 ) )
            {
            // InternalSceneDl.g:1307:1: ( ( rule__DynamicEntity__AttributesAssignment_4_2_1 ) )
            // InternalSceneDl.g:1308:2: ( rule__DynamicEntity__AttributesAssignment_4_2_1 )
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_2_1()); 
            // InternalSceneDl.g:1309:2: ( rule__DynamicEntity__AttributesAssignment_4_2_1 )
            // InternalSceneDl.g:1309:3: rule__DynamicEntity__AttributesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicEntity__AttributesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicEntityAccess().getAttributesAssignment_4_2_1()); 

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
    // $ANTLR end "rule__DynamicEntity__Group_4_2__1__Impl"


    // $ANTLR start "rule__RegularAttribute__Group__0"
    // InternalSceneDl.g:1318:1: rule__RegularAttribute__Group__0 : rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1 ;
    public final void rule__RegularAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1322:1: ( rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1 )
            // InternalSceneDl.g:1323:2: rule__RegularAttribute__Group__0__Impl rule__RegularAttribute__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSceneDl.g:1330:1: rule__RegularAttribute__Group__0__Impl : ( ( rule__RegularAttribute__NameAssignment_0 ) ) ;
    public final void rule__RegularAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1334:1: ( ( ( rule__RegularAttribute__NameAssignment_0 ) ) )
            // InternalSceneDl.g:1335:1: ( ( rule__RegularAttribute__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:1335:1: ( ( rule__RegularAttribute__NameAssignment_0 ) )
            // InternalSceneDl.g:1336:2: ( rule__RegularAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getRegularAttributeAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:1337:2: ( rule__RegularAttribute__NameAssignment_0 )
            // InternalSceneDl.g:1337:3: rule__RegularAttribute__NameAssignment_0
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
    // InternalSceneDl.g:1345:1: rule__RegularAttribute__Group__1 : rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2 ;
    public final void rule__RegularAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1349:1: ( rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2 )
            // InternalSceneDl.g:1350:2: rule__RegularAttribute__Group__1__Impl rule__RegularAttribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSceneDl.g:1357:1: rule__RegularAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__RegularAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1361:1: ( ( ':' ) )
            // InternalSceneDl.g:1362:1: ( ':' )
            {
            // InternalSceneDl.g:1362:1: ( ':' )
            // InternalSceneDl.g:1363:2: ':'
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
    // InternalSceneDl.g:1372:1: rule__RegularAttribute__Group__2 : rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3 ;
    public final void rule__RegularAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1376:1: ( rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3 )
            // InternalSceneDl.g:1377:2: rule__RegularAttribute__Group__2__Impl rule__RegularAttribute__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalSceneDl.g:1384:1: rule__RegularAttribute__Group__2__Impl : ( ( rule__RegularAttribute__TypeAssignment_2 ) ) ;
    public final void rule__RegularAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1388:1: ( ( ( rule__RegularAttribute__TypeAssignment_2 ) ) )
            // InternalSceneDl.g:1389:1: ( ( rule__RegularAttribute__TypeAssignment_2 ) )
            {
            // InternalSceneDl.g:1389:1: ( ( rule__RegularAttribute__TypeAssignment_2 ) )
            // InternalSceneDl.g:1390:2: ( rule__RegularAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getRegularAttributeAccess().getTypeAssignment_2()); 
            // InternalSceneDl.g:1391:2: ( rule__RegularAttribute__TypeAssignment_2 )
            // InternalSceneDl.g:1391:3: rule__RegularAttribute__TypeAssignment_2
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
    // InternalSceneDl.g:1399:1: rule__RegularAttribute__Group__3 : rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4 ;
    public final void rule__RegularAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1403:1: ( rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4 )
            // InternalSceneDl.g:1404:2: rule__RegularAttribute__Group__3__Impl rule__RegularAttribute__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSceneDl.g:1411:1: rule__RegularAttribute__Group__3__Impl : ( ( '[' )? ) ;
    public final void rule__RegularAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1415:1: ( ( ( '[' )? ) )
            // InternalSceneDl.g:1416:1: ( ( '[' )? )
            {
            // InternalSceneDl.g:1416:1: ( ( '[' )? )
            // InternalSceneDl.g:1417:2: ( '[' )?
            {
             before(grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3()); 
            // InternalSceneDl.g:1418:2: ( '[' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDl.g:1418:3: '['
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
    // InternalSceneDl.g:1426:1: rule__RegularAttribute__Group__4 : rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5 ;
    public final void rule__RegularAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1430:1: ( rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5 )
            // InternalSceneDl.g:1431:2: rule__RegularAttribute__Group__4__Impl rule__RegularAttribute__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSceneDl.g:1438:1: rule__RegularAttribute__Group__4__Impl : ( ( rule__RegularAttribute__ValueAssignment_4 ) ) ;
    public final void rule__RegularAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1442:1: ( ( ( rule__RegularAttribute__ValueAssignment_4 ) ) )
            // InternalSceneDl.g:1443:1: ( ( rule__RegularAttribute__ValueAssignment_4 ) )
            {
            // InternalSceneDl.g:1443:1: ( ( rule__RegularAttribute__ValueAssignment_4 ) )
            // InternalSceneDl.g:1444:2: ( rule__RegularAttribute__ValueAssignment_4 )
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAssignment_4()); 
            // InternalSceneDl.g:1445:2: ( rule__RegularAttribute__ValueAssignment_4 )
            // InternalSceneDl.g:1445:3: rule__RegularAttribute__ValueAssignment_4
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
    // InternalSceneDl.g:1453:1: rule__RegularAttribute__Group__5 : rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6 ;
    public final void rule__RegularAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1457:1: ( rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6 )
            // InternalSceneDl.g:1458:2: rule__RegularAttribute__Group__5__Impl rule__RegularAttribute__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalSceneDl.g:1465:1: rule__RegularAttribute__Group__5__Impl : ( ( rule__RegularAttribute__Group_5__0 )? ) ;
    public final void rule__RegularAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1469:1: ( ( ( rule__RegularAttribute__Group_5__0 )? ) )
            // InternalSceneDl.g:1470:1: ( ( rule__RegularAttribute__Group_5__0 )? )
            {
            // InternalSceneDl.g:1470:1: ( ( rule__RegularAttribute__Group_5__0 )? )
            // InternalSceneDl.g:1471:2: ( rule__RegularAttribute__Group_5__0 )?
            {
             before(grammarAccess.getRegularAttributeAccess().getGroup_5()); 
            // InternalSceneDl.g:1472:2: ( rule__RegularAttribute__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSceneDl.g:1472:3: rule__RegularAttribute__Group_5__0
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
    // InternalSceneDl.g:1480:1: rule__RegularAttribute__Group__6 : rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7 ;
    public final void rule__RegularAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1484:1: ( rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7 )
            // InternalSceneDl.g:1485:2: rule__RegularAttribute__Group__6__Impl rule__RegularAttribute__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalSceneDl.g:1492:1: rule__RegularAttribute__Group__6__Impl : ( ( ']' )? ) ;
    public final void rule__RegularAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1496:1: ( ( ( ']' )? ) )
            // InternalSceneDl.g:1497:1: ( ( ']' )? )
            {
            // InternalSceneDl.g:1497:1: ( ( ']' )? )
            // InternalSceneDl.g:1498:2: ( ']' )?
            {
             before(grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6()); 
            // InternalSceneDl.g:1499:2: ( ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDl.g:1499:3: ']'
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
    // InternalSceneDl.g:1507:1: rule__RegularAttribute__Group__7 : rule__RegularAttribute__Group__7__Impl ;
    public final void rule__RegularAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1511:1: ( rule__RegularAttribute__Group__7__Impl )
            // InternalSceneDl.g:1512:2: rule__RegularAttribute__Group__7__Impl
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
    // InternalSceneDl.g:1518:1: rule__RegularAttribute__Group__7__Impl : ( ( rule__RegularAttribute__IsTransientAssignment_7 )? ) ;
    public final void rule__RegularAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1522:1: ( ( ( rule__RegularAttribute__IsTransientAssignment_7 )? ) )
            // InternalSceneDl.g:1523:1: ( ( rule__RegularAttribute__IsTransientAssignment_7 )? )
            {
            // InternalSceneDl.g:1523:1: ( ( rule__RegularAttribute__IsTransientAssignment_7 )? )
            // InternalSceneDl.g:1524:2: ( rule__RegularAttribute__IsTransientAssignment_7 )?
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientAssignment_7()); 
            // InternalSceneDl.g:1525:2: ( rule__RegularAttribute__IsTransientAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDl.g:1525:3: rule__RegularAttribute__IsTransientAssignment_7
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
    // InternalSceneDl.g:1534:1: rule__RegularAttribute__Group_5__0 : rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1 ;
    public final void rule__RegularAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1538:1: ( rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1 )
            // InternalSceneDl.g:1539:2: rule__RegularAttribute__Group_5__0__Impl rule__RegularAttribute__Group_5__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSceneDl.g:1546:1: rule__RegularAttribute__Group_5__0__Impl : ( '-' ) ;
    public final void rule__RegularAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1550:1: ( ( '-' ) )
            // InternalSceneDl.g:1551:1: ( '-' )
            {
            // InternalSceneDl.g:1551:1: ( '-' )
            // InternalSceneDl.g:1552:2: '-'
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
    // InternalSceneDl.g:1561:1: rule__RegularAttribute__Group_5__1 : rule__RegularAttribute__Group_5__1__Impl ;
    public final void rule__RegularAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1565:1: ( rule__RegularAttribute__Group_5__1__Impl )
            // InternalSceneDl.g:1566:2: rule__RegularAttribute__Group_5__1__Impl
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
    // InternalSceneDl.g:1572:1: rule__RegularAttribute__Group_5__1__Impl : ( ( rule__RegularAttribute__ValueAssignment_5_1 ) ) ;
    public final void rule__RegularAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1576:1: ( ( ( rule__RegularAttribute__ValueAssignment_5_1 ) ) )
            // InternalSceneDl.g:1577:1: ( ( rule__RegularAttribute__ValueAssignment_5_1 ) )
            {
            // InternalSceneDl.g:1577:1: ( ( rule__RegularAttribute__ValueAssignment_5_1 ) )
            // InternalSceneDl.g:1578:2: ( rule__RegularAttribute__ValueAssignment_5_1 )
            {
             before(grammarAccess.getRegularAttributeAccess().getValueAssignment_5_1()); 
            // InternalSceneDl.g:1579:2: ( rule__RegularAttribute__ValueAssignment_5_1 )
            // InternalSceneDl.g:1579:3: rule__RegularAttribute__ValueAssignment_5_1
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
    // InternalSceneDl.g:1588:1: rule__PositionAttribute__Group__0 : rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1 ;
    public final void rule__PositionAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1592:1: ( rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1 )
            // InternalSceneDl.g:1593:2: rule__PositionAttribute__Group__0__Impl rule__PositionAttribute__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSceneDl.g:1600:1: rule__PositionAttribute__Group__0__Impl : ( ( rule__PositionAttribute__NameAssignment_0 ) ) ;
    public final void rule__PositionAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1604:1: ( ( ( rule__PositionAttribute__NameAssignment_0 ) ) )
            // InternalSceneDl.g:1605:1: ( ( rule__PositionAttribute__NameAssignment_0 ) )
            {
            // InternalSceneDl.g:1605:1: ( ( rule__PositionAttribute__NameAssignment_0 ) )
            // InternalSceneDl.g:1606:2: ( rule__PositionAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getPositionAttributeAccess().getNameAssignment_0()); 
            // InternalSceneDl.g:1607:2: ( rule__PositionAttribute__NameAssignment_0 )
            // InternalSceneDl.g:1607:3: rule__PositionAttribute__NameAssignment_0
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
    // InternalSceneDl.g:1615:1: rule__PositionAttribute__Group__1 : rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2 ;
    public final void rule__PositionAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1619:1: ( rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2 )
            // InternalSceneDl.g:1620:2: rule__PositionAttribute__Group__1__Impl rule__PositionAttribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSceneDl.g:1627:1: rule__PositionAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__PositionAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1631:1: ( ( ':' ) )
            // InternalSceneDl.g:1632:1: ( ':' )
            {
            // InternalSceneDl.g:1632:1: ( ':' )
            // InternalSceneDl.g:1633:2: ':'
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
    // InternalSceneDl.g:1642:1: rule__PositionAttribute__Group__2 : rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3 ;
    public final void rule__PositionAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1646:1: ( rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3 )
            // InternalSceneDl.g:1647:2: rule__PositionAttribute__Group__2__Impl rule__PositionAttribute__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSceneDl.g:1654:1: rule__PositionAttribute__Group__2__Impl : ( ( rule__PositionAttribute__TypeAssignment_2 ) ) ;
    public final void rule__PositionAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1658:1: ( ( ( rule__PositionAttribute__TypeAssignment_2 ) ) )
            // InternalSceneDl.g:1659:1: ( ( rule__PositionAttribute__TypeAssignment_2 ) )
            {
            // InternalSceneDl.g:1659:1: ( ( rule__PositionAttribute__TypeAssignment_2 ) )
            // InternalSceneDl.g:1660:2: ( rule__PositionAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getPositionAttributeAccess().getTypeAssignment_2()); 
            // InternalSceneDl.g:1661:2: ( rule__PositionAttribute__TypeAssignment_2 )
            // InternalSceneDl.g:1661:3: rule__PositionAttribute__TypeAssignment_2
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
    // InternalSceneDl.g:1669:1: rule__PositionAttribute__Group__3 : rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4 ;
    public final void rule__PositionAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1673:1: ( rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4 )
            // InternalSceneDl.g:1674:2: rule__PositionAttribute__Group__3__Impl rule__PositionAttribute__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSceneDl.g:1681:1: rule__PositionAttribute__Group__3__Impl : ( '[' ) ;
    public final void rule__PositionAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1685:1: ( ( '[' ) )
            // InternalSceneDl.g:1686:1: ( '[' )
            {
            // InternalSceneDl.g:1686:1: ( '[' )
            // InternalSceneDl.g:1687:2: '['
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
    // InternalSceneDl.g:1696:1: rule__PositionAttribute__Group__4 : rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5 ;
    public final void rule__PositionAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1700:1: ( rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5 )
            // InternalSceneDl.g:1701:2: rule__PositionAttribute__Group__4__Impl rule__PositionAttribute__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSceneDl.g:1708:1: rule__PositionAttribute__Group__4__Impl : ( ( rule__PositionAttribute__XAssignment_4 ) ) ;
    public final void rule__PositionAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1712:1: ( ( ( rule__PositionAttribute__XAssignment_4 ) ) )
            // InternalSceneDl.g:1713:1: ( ( rule__PositionAttribute__XAssignment_4 ) )
            {
            // InternalSceneDl.g:1713:1: ( ( rule__PositionAttribute__XAssignment_4 ) )
            // InternalSceneDl.g:1714:2: ( rule__PositionAttribute__XAssignment_4 )
            {
             before(grammarAccess.getPositionAttributeAccess().getXAssignment_4()); 
            // InternalSceneDl.g:1715:2: ( rule__PositionAttribute__XAssignment_4 )
            // InternalSceneDl.g:1715:3: rule__PositionAttribute__XAssignment_4
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
    // InternalSceneDl.g:1723:1: rule__PositionAttribute__Group__5 : rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6 ;
    public final void rule__PositionAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1727:1: ( rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6 )
            // InternalSceneDl.g:1728:2: rule__PositionAttribute__Group__5__Impl rule__PositionAttribute__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalSceneDl.g:1735:1: rule__PositionAttribute__Group__5__Impl : ( ';' ) ;
    public final void rule__PositionAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1739:1: ( ( ';' ) )
            // InternalSceneDl.g:1740:1: ( ';' )
            {
            // InternalSceneDl.g:1740:1: ( ';' )
            // InternalSceneDl.g:1741:2: ';'
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
    // InternalSceneDl.g:1750:1: rule__PositionAttribute__Group__6 : rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7 ;
    public final void rule__PositionAttribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1754:1: ( rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7 )
            // InternalSceneDl.g:1755:2: rule__PositionAttribute__Group__6__Impl rule__PositionAttribute__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalSceneDl.g:1762:1: rule__PositionAttribute__Group__6__Impl : ( ( rule__PositionAttribute__YAssignment_6 ) ) ;
    public final void rule__PositionAttribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1766:1: ( ( ( rule__PositionAttribute__YAssignment_6 ) ) )
            // InternalSceneDl.g:1767:1: ( ( rule__PositionAttribute__YAssignment_6 ) )
            {
            // InternalSceneDl.g:1767:1: ( ( rule__PositionAttribute__YAssignment_6 ) )
            // InternalSceneDl.g:1768:2: ( rule__PositionAttribute__YAssignment_6 )
            {
             before(grammarAccess.getPositionAttributeAccess().getYAssignment_6()); 
            // InternalSceneDl.g:1769:2: ( rule__PositionAttribute__YAssignment_6 )
            // InternalSceneDl.g:1769:3: rule__PositionAttribute__YAssignment_6
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
    // InternalSceneDl.g:1777:1: rule__PositionAttribute__Group__7 : rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8 ;
    public final void rule__PositionAttribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1781:1: ( rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8 )
            // InternalSceneDl.g:1782:2: rule__PositionAttribute__Group__7__Impl rule__PositionAttribute__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalSceneDl.g:1789:1: rule__PositionAttribute__Group__7__Impl : ( ']' ) ;
    public final void rule__PositionAttribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1793:1: ( ( ']' ) )
            // InternalSceneDl.g:1794:1: ( ']' )
            {
            // InternalSceneDl.g:1794:1: ( ']' )
            // InternalSceneDl.g:1795:2: ']'
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
    // InternalSceneDl.g:1804:1: rule__PositionAttribute__Group__8 : rule__PositionAttribute__Group__8__Impl ;
    public final void rule__PositionAttribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1808:1: ( rule__PositionAttribute__Group__8__Impl )
            // InternalSceneDl.g:1809:2: rule__PositionAttribute__Group__8__Impl
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
    // InternalSceneDl.g:1815:1: rule__PositionAttribute__Group__8__Impl : ( ( rule__PositionAttribute__IsTransientAssignment_8 )? ) ;
    public final void rule__PositionAttribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1819:1: ( ( ( rule__PositionAttribute__IsTransientAssignment_8 )? ) )
            // InternalSceneDl.g:1820:1: ( ( rule__PositionAttribute__IsTransientAssignment_8 )? )
            {
            // InternalSceneDl.g:1820:1: ( ( rule__PositionAttribute__IsTransientAssignment_8 )? )
            // InternalSceneDl.g:1821:2: ( rule__PositionAttribute__IsTransientAssignment_8 )?
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientAssignment_8()); 
            // InternalSceneDl.g:1822:2: ( rule__PositionAttribute__IsTransientAssignment_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSceneDl.g:1822:3: rule__PositionAttribute__IsTransientAssignment_8
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
    // InternalSceneDl.g:1831:1: rule__AttributeValue__Group_2__0 : rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1 ;
    public final void rule__AttributeValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1835:1: ( rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1 )
            // InternalSceneDl.g:1836:2: rule__AttributeValue__Group_2__0__Impl rule__AttributeValue__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSceneDl.g:1843:1: rule__AttributeValue__Group_2__0__Impl : ( RULE_INT ) ;
    public final void rule__AttributeValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1847:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:1848:1: ( RULE_INT )
            {
            // InternalSceneDl.g:1848:1: ( RULE_INT )
            // InternalSceneDl.g:1849:2: RULE_INT
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
    // InternalSceneDl.g:1858:1: rule__AttributeValue__Group_2__1 : rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2 ;
    public final void rule__AttributeValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1862:1: ( rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2 )
            // InternalSceneDl.g:1863:2: rule__AttributeValue__Group_2__1__Impl rule__AttributeValue__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSceneDl.g:1870:1: rule__AttributeValue__Group_2__1__Impl : ( '.' ) ;
    public final void rule__AttributeValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1874:1: ( ( '.' ) )
            // InternalSceneDl.g:1875:1: ( '.' )
            {
            // InternalSceneDl.g:1875:1: ( '.' )
            // InternalSceneDl.g:1876:2: '.'
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
    // InternalSceneDl.g:1885:1: rule__AttributeValue__Group_2__2 : rule__AttributeValue__Group_2__2__Impl ;
    public final void rule__AttributeValue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1889:1: ( rule__AttributeValue__Group_2__2__Impl )
            // InternalSceneDl.g:1890:2: rule__AttributeValue__Group_2__2__Impl
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
    // InternalSceneDl.g:1896:1: rule__AttributeValue__Group_2__2__Impl : ( RULE_INT ) ;
    public final void rule__AttributeValue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1900:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:1901:1: ( RULE_INT )
            {
            // InternalSceneDl.g:1901:1: ( RULE_INT )
            // InternalSceneDl.g:1902:2: RULE_INT
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
    // InternalSceneDl.g:1912:1: rule__Scene__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1916:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:1917:2: ( RULE_ID )
            {
            // InternalSceneDl.g:1917:2: ( RULE_ID )
            // InternalSceneDl.g:1918:3: RULE_ID
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
    // InternalSceneDl.g:1927:1: rule__Scene__ElementsAssignment_1 : ( ruleElement ) ;
    public final void rule__Scene__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1931:1: ( ( ruleElement ) )
            // InternalSceneDl.g:1932:2: ( ruleElement )
            {
            // InternalSceneDl.g:1932:2: ( ruleElement )
            // InternalSceneDl.g:1933:3: ruleElement
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
    // InternalSceneDl.g:1942:1: rule__StaticEntity__TypeAssignment_0 : ( ( 'static_entity' ) ) ;
    public final void rule__StaticEntity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1946:1: ( ( ( 'static_entity' ) ) )
            // InternalSceneDl.g:1947:2: ( ( 'static_entity' ) )
            {
            // InternalSceneDl.g:1947:2: ( ( 'static_entity' ) )
            // InternalSceneDl.g:1948:3: ( 'static_entity' )
            {
             before(grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0()); 
            // InternalSceneDl.g:1949:3: ( 'static_entity' )
            // InternalSceneDl.g:1950:4: 'static_entity'
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
    // InternalSceneDl.g:1961:1: rule__StaticEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StaticEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1965:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:1966:2: ( RULE_ID )
            {
            // InternalSceneDl.g:1966:2: ( RULE_ID )
            // InternalSceneDl.g:1967:3: RULE_ID
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
    // InternalSceneDl.g:1976:1: rule__StaticEntity__KeyAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__KeyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1980:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:1981:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:1981:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:1982:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getKeyAttributeCrossReference_2_1_0()); 
            // InternalSceneDl.g:1983:3: ( RULE_ID )
            // InternalSceneDl.g:1984:4: RULE_ID
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
    // InternalSceneDl.g:1995:1: rule__StaticEntity__IsAAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__IsAAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:1999:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2000:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2000:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2001:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getIsAElementCrossReference_3_1_0()); 
            // InternalSceneDl.g:2002:3: ( RULE_ID )
            // InternalSceneDl.g:2003:4: RULE_ID
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
    // InternalSceneDl.g:2014:1: rule__StaticEntity__AttributesAssignment_4_1_0 : ( ruleAttribute ) ;
    public final void rule__StaticEntity__AttributesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2018:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2019:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2019:2: ( ruleAttribute )
            // InternalSceneDl.g:2020:3: ruleAttribute
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
    // InternalSceneDl.g:2029:1: rule__StaticEntity__FeaturesAssignment_4_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__FeaturesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2033:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2034:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2034:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2035:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_1_1_0()); 
            // InternalSceneDl.g:2036:3: ( RULE_ID )
            // InternalSceneDl.g:2037:4: RULE_ID
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityIDTerminalRuleCall_4_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityIDTerminalRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_1_1_0()); 

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
    // InternalSceneDl.g:2048:1: rule__StaticEntity__AttributesAssignment_4_2_0_1 : ( ruleAttribute ) ;
    public final void rule__StaticEntity__AttributesAssignment_4_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2052:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2053:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2053:2: ( ruleAttribute )
            // InternalSceneDl.g:2054:3: ruleAttribute
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
    // InternalSceneDl.g:2063:1: rule__StaticEntity__FeaturesAssignment_4_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__StaticEntity__FeaturesAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2067:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2068:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2068:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2069:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_2_1_1_0()); 
            // InternalSceneDl.g:2070:3: ( RULE_ID )
            // InternalSceneDl.g:2071:4: RULE_ID
            {
             before(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityIDTerminalRuleCall_4_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityIDTerminalRuleCall_4_2_1_1_0_1()); 

            }

             after(grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_2_1_1_0()); 

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
    // InternalSceneDl.g:2082:1: rule__DynamicEntity__TypeAssignment_0 : ( ( 'dynamic_entity' ) ) ;
    public final void rule__DynamicEntity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2086:1: ( ( ( 'dynamic_entity' ) ) )
            // InternalSceneDl.g:2087:2: ( ( 'dynamic_entity' ) )
            {
            // InternalSceneDl.g:2087:2: ( ( 'dynamic_entity' ) )
            // InternalSceneDl.g:2088:3: ( 'dynamic_entity' )
            {
             before(grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0()); 
            // InternalSceneDl.g:2089:3: ( 'dynamic_entity' )
            // InternalSceneDl.g:2090:4: 'dynamic_entity'
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
    // InternalSceneDl.g:2101:1: rule__DynamicEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DynamicEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2105:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2106:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2106:2: ( RULE_ID )
            // InternalSceneDl.g:2107:3: RULE_ID
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
    // InternalSceneDl.g:2116:1: rule__DynamicEntity__KeyAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicEntity__KeyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2120:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2121:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2121:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2122:3: ( RULE_ID )
            {
             before(grammarAccess.getDynamicEntityAccess().getKeyAttributeCrossReference_2_1_0()); 
            // InternalSceneDl.g:2123:3: ( RULE_ID )
            // InternalSceneDl.g:2124:4: RULE_ID
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
    // InternalSceneDl.g:2135:1: rule__DynamicEntity__IsAAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DynamicEntity__IsAAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2139:1: ( ( ( RULE_ID ) ) )
            // InternalSceneDl.g:2140:2: ( ( RULE_ID ) )
            {
            // InternalSceneDl.g:2140:2: ( ( RULE_ID ) )
            // InternalSceneDl.g:2141:3: ( RULE_ID )
            {
             before(grammarAccess.getDynamicEntityAccess().getIsAElementCrossReference_3_1_0()); 
            // InternalSceneDl.g:2142:3: ( RULE_ID )
            // InternalSceneDl.g:2143:4: RULE_ID
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


    // $ANTLR start "rule__DynamicEntity__AttributesAssignment_4_1"
    // InternalSceneDl.g:2154:1: rule__DynamicEntity__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__DynamicEntity__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2158:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2159:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2159:2: ( ruleAttribute )
            // InternalSceneDl.g:2160:3: ruleAttribute
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__DynamicEntity__AttributesAssignment_4_1"


    // $ANTLR start "rule__DynamicEntity__AttributesAssignment_4_2_1"
    // InternalSceneDl.g:2169:1: rule__DynamicEntity__AttributesAssignment_4_2_1 : ( ruleAttribute ) ;
    public final void rule__DynamicEntity__AttributesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2173:1: ( ( ruleAttribute ) )
            // InternalSceneDl.g:2174:2: ( ruleAttribute )
            {
            // InternalSceneDl.g:2174:2: ( ruleAttribute )
            // InternalSceneDl.g:2175:3: ruleAttribute
            {
             before(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__DynamicEntity__AttributesAssignment_4_2_1"


    // $ANTLR start "rule__RegularAttribute__NameAssignment_0"
    // InternalSceneDl.g:2184:1: rule__RegularAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__RegularAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2188:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2189:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2189:2: ( RULE_ID )
            // InternalSceneDl.g:2190:3: RULE_ID
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
    // InternalSceneDl.g:2199:1: rule__RegularAttribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__RegularAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2203:1: ( ( ruleAttributeType ) )
            // InternalSceneDl.g:2204:2: ( ruleAttributeType )
            {
            // InternalSceneDl.g:2204:2: ( ruleAttributeType )
            // InternalSceneDl.g:2205:3: ruleAttributeType
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
    // InternalSceneDl.g:2214:1: rule__RegularAttribute__ValueAssignment_4 : ( ruleAttributeValue ) ;
    public final void rule__RegularAttribute__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2218:1: ( ( ruleAttributeValue ) )
            // InternalSceneDl.g:2219:2: ( ruleAttributeValue )
            {
            // InternalSceneDl.g:2219:2: ( ruleAttributeValue )
            // InternalSceneDl.g:2220:3: ruleAttributeValue
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
    // InternalSceneDl.g:2229:1: rule__RegularAttribute__ValueAssignment_5_1 : ( ruleAttributeValue ) ;
    public final void rule__RegularAttribute__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2233:1: ( ( ruleAttributeValue ) )
            // InternalSceneDl.g:2234:2: ( ruleAttributeValue )
            {
            // InternalSceneDl.g:2234:2: ( ruleAttributeValue )
            // InternalSceneDl.g:2235:3: ruleAttributeValue
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
    // InternalSceneDl.g:2244:1: rule__RegularAttribute__IsTransientAssignment_7 : ( ( 'transient' ) ) ;
    public final void rule__RegularAttribute__IsTransientAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2248:1: ( ( ( 'transient' ) ) )
            // InternalSceneDl.g:2249:2: ( ( 'transient' ) )
            {
            // InternalSceneDl.g:2249:2: ( ( 'transient' ) )
            // InternalSceneDl.g:2250:3: ( 'transient' )
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 
            // InternalSceneDl.g:2251:3: ( 'transient' )
            // InternalSceneDl.g:2252:4: 'transient'
            {
             before(grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSceneDl.g:2263:1: rule__PositionAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PositionAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2267:1: ( ( RULE_ID ) )
            // InternalSceneDl.g:2268:2: ( RULE_ID )
            {
            // InternalSceneDl.g:2268:2: ( RULE_ID )
            // InternalSceneDl.g:2269:3: RULE_ID
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
    // InternalSceneDl.g:2278:1: rule__PositionAttribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__PositionAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2282:1: ( ( ruleAttributeType ) )
            // InternalSceneDl.g:2283:2: ( ruleAttributeType )
            {
            // InternalSceneDl.g:2283:2: ( ruleAttributeType )
            // InternalSceneDl.g:2284:3: ruleAttributeType
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
    // InternalSceneDl.g:2293:1: rule__PositionAttribute__XAssignment_4 : ( RULE_INT ) ;
    public final void rule__PositionAttribute__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2297:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2298:2: ( RULE_INT )
            {
            // InternalSceneDl.g:2298:2: ( RULE_INT )
            // InternalSceneDl.g:2299:3: RULE_INT
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
    // InternalSceneDl.g:2308:1: rule__PositionAttribute__YAssignment_6 : ( RULE_INT ) ;
    public final void rule__PositionAttribute__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2312:1: ( ( RULE_INT ) )
            // InternalSceneDl.g:2313:2: ( RULE_INT )
            {
            // InternalSceneDl.g:2313:2: ( RULE_INT )
            // InternalSceneDl.g:2314:3: RULE_INT
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
    // InternalSceneDl.g:2323:1: rule__PositionAttribute__IsTransientAssignment_8 : ( ( 'transient' ) ) ;
    public final void rule__PositionAttribute__IsTransientAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSceneDl.g:2327:1: ( ( ( 'transient' ) ) )
            // InternalSceneDl.g:2328:2: ( ( 'transient' ) )
            {
            // InternalSceneDl.g:2328:2: ( ( 'transient' ) )
            // InternalSceneDl.g:2329:3: ( 'transient' )
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 
            // InternalSceneDl.g:2330:3: ( 'transient' )
            // InternalSceneDl.g:2331:4: 'transient'
            {
             before(grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});

}