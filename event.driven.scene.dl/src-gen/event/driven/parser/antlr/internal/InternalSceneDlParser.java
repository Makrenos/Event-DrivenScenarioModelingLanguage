package event.driven.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import event.driven.services.SceneDlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSceneDlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'static_entity'", "'key'", "'isA'", "'{'", "','", "'}'", "'dynamic_entity'", "'many'", "':'", "'['", "'-'", "']'", "'transient'", "';'", "'.'", "'range'", "'value'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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

        public InternalSceneDlParser(TokenStream input, SceneDlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Scene";
       	}

       	@Override
       	protected SceneDlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScene"
    // InternalSceneDl.g:65:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalSceneDl.g:65:46: (iv_ruleScene= ruleScene EOF )
            // InternalSceneDl.g:66:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalSceneDl.g:72:1: ruleScene returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:78:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_elements_1_0= ruleElement ) )* ) )
            // InternalSceneDl.g:79:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_elements_1_0= ruleElement ) )* )
            {
            // InternalSceneDl.g:79:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_elements_1_0= ruleElement ) )* )
            // InternalSceneDl.g:80:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_elements_1_0= ruleElement ) )*
            {
            // InternalSceneDl.g:80:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSceneDl.g:81:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSceneDl.g:81:4: (lv_name_0_0= RULE_ID )
            // InternalSceneDl.g:82:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSceneDl.g:98:3: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSceneDl.g:99:4: (lv_elements_1_0= ruleElement )
            	    {
            	    // InternalSceneDl.g:99:4: (lv_elements_1_0= ruleElement )
            	    // InternalSceneDl.g:100:5: lv_elements_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getElementsElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"event.driven.SceneDl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleElement"
    // InternalSceneDl.g:121:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSceneDl.g:121:48: (iv_ruleElement= ruleElement EOF )
            // InternalSceneDl.g:122:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSceneDl.g:128:1: ruleElement returns [EObject current=null] : (this_StaticEntity_0= ruleStaticEntity | this_DynamicEntity_1= ruleDynamicEntity ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_StaticEntity_0 = null;

        EObject this_DynamicEntity_1 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:134:2: ( (this_StaticEntity_0= ruleStaticEntity | this_DynamicEntity_1= ruleDynamicEntity ) )
            // InternalSceneDl.g:135:2: (this_StaticEntity_0= ruleStaticEntity | this_DynamicEntity_1= ruleDynamicEntity )
            {
            // InternalSceneDl.g:135:2: (this_StaticEntity_0= ruleStaticEntity | this_DynamicEntity_1= ruleDynamicEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSceneDl.g:136:3: this_StaticEntity_0= ruleStaticEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getStaticEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticEntity_0=ruleStaticEntity();

                    state._fsp--;


                    			current = this_StaticEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:145:3: this_DynamicEntity_1= ruleDynamicEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDynamicEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DynamicEntity_1=ruleDynamicEntity();

                    state._fsp--;


                    			current = this_DynamicEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleStaticEntity"
    // InternalSceneDl.g:157:1: entryRuleStaticEntity returns [EObject current=null] : iv_ruleStaticEntity= ruleStaticEntity EOF ;
    public final EObject entryRuleStaticEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticEntity = null;


        try {
            // InternalSceneDl.g:157:53: (iv_ruleStaticEntity= ruleStaticEntity EOF )
            // InternalSceneDl.g:158:2: iv_ruleStaticEntity= ruleStaticEntity EOF
            {
             newCompositeNode(grammarAccess.getStaticEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticEntity=ruleStaticEntity();

            state._fsp--;

             current =iv_ruleStaticEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticEntity"


    // $ANTLR start "ruleStaticEntity"
    // InternalSceneDl.g:164:1: ruleStaticEntity returns [EObject current=null] : ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleStaticEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_features_12_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:170:2: ( ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )? ) )
            // InternalSceneDl.g:171:2: ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )? )
            {
            // InternalSceneDl.g:171:2: ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )? )
            // InternalSceneDl.g:172:3: ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )?
            {
            // InternalSceneDl.g:172:3: ( (lv_type_0_0= 'static_entity' ) )
            // InternalSceneDl.g:173:4: (lv_type_0_0= 'static_entity' )
            {
            // InternalSceneDl.g:173:4: (lv_type_0_0= 'static_entity' )
            // InternalSceneDl.g:174:5: lv_type_0_0= 'static_entity'
            {
            lv_type_0_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticEntityRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "static_entity");
            				

            }


            }

            // InternalSceneDl.g:186:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSceneDl.g:187:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSceneDl.g:187:4: (lv_name_1_0= RULE_ID )
            // InternalSceneDl.g:188:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStaticEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSceneDl.g:204:3: (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSceneDl.g:205:4: otherlv_2= 'key' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getStaticEntityAccess().getKeyKeyword_2_0());
                    			
                    // InternalSceneDl.g:209:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSceneDl.g:210:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSceneDl.g:210:5: (otherlv_3= RULE_ID )
                    // InternalSceneDl.g:211:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStaticEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getStaticEntityAccess().getKeyAttributeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDl.g:223:3: (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSceneDl.g:224:4: otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStaticEntityAccess().getIsAKeyword_3_0());
            	    			
            	    // InternalSceneDl.g:228:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSceneDl.g:229:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSceneDl.g:229:5: (otherlv_5= RULE_ID )
            	    // InternalSceneDl.g:230:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStaticEntityRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_5, grammarAccess.getStaticEntityAccess().getIsAElementCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSceneDl.g:242:3: (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSceneDl.g:243:4: otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaticEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSceneDl.g:247:4: ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_features_8_0= ruleFeature ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==19) ) {
                            int LA5_3 = input.LA(3);

                            if ( (LA5_3==RULE_ID) ) {
                                alt5=2;
                            }
                            else if ( ((LA5_3>=26 && LA5_3<=27)) ) {
                                alt5=1;
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
                    else if ( (LA5_0==18) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalSceneDl.g:248:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            {
                            // InternalSceneDl.g:248:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            // InternalSceneDl.g:249:6: (lv_attributes_7_0= ruleAttribute )
                            {
                            // InternalSceneDl.g:249:6: (lv_attributes_7_0= ruleAttribute )
                            // InternalSceneDl.g:250:7: lv_attributes_7_0= ruleAttribute
                            {

                            							newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_attributes_7_0=ruleAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStaticEntityRule());
                            							}
                            							add(
                            								current,
                            								"attributes",
                            								lv_attributes_7_0,
                            								"event.driven.SceneDl.Attribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSceneDl.g:268:5: ( (lv_features_8_0= ruleFeature ) )
                            {
                            // InternalSceneDl.g:268:5: ( (lv_features_8_0= ruleFeature ) )
                            // InternalSceneDl.g:269:6: (lv_features_8_0= ruleFeature )
                            {
                            // InternalSceneDl.g:269:6: (lv_features_8_0= ruleFeature )
                            // InternalSceneDl.g:270:7: lv_features_8_0= ruleFeature
                            {

                            							newCompositeNode(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_features_8_0=ruleFeature();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStaticEntityRule());
                            							}
                            							add(
                            								current,
                            								"features",
                            								lv_features_8_0,
                            								"event.driven.SceneDl.Feature");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSceneDl.g:288:4: ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==18) ) {
                                alt6=2;
                            }
                            else if ( (LA6_2==RULE_ID) ) {
                                int LA6_4 = input.LA(3);

                                if ( (LA6_4==19) ) {
                                    int LA6_5 = input.LA(4);

                                    if ( ((LA6_5>=26 && LA6_5<=27)) ) {
                                        alt6=1;
                                    }
                                    else if ( (LA6_5==RULE_ID) ) {
                                        alt6=2;
                                    }


                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSceneDl.g:289:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    {
                    	    // InternalSceneDl.g:289:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    // InternalSceneDl.g:290:6: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_0_0());
                    	    					
                    	    // InternalSceneDl.g:294:6: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    // InternalSceneDl.g:295:7: (lv_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalSceneDl.g:295:7: (lv_attributes_10_0= ruleAttribute )
                    	    // InternalSceneDl.g:296:8: lv_attributes_10_0= ruleAttribute
                    	    {

                    	    								newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getStaticEntityRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"attributes",
                    	    									lv_attributes_10_0,
                    	    									"event.driven.SceneDl.Attribute");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSceneDl.g:315:5: (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )
                    	    {
                    	    // InternalSceneDl.g:315:5: (otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) ) )
                    	    // InternalSceneDl.g:316:6: otherlv_11= ',' ( (lv_features_12_0= ruleFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalSceneDl.g:320:6: ( (lv_features_12_0= ruleFeature ) )
                    	    // InternalSceneDl.g:321:7: (lv_features_12_0= ruleFeature )
                    	    {
                    	    // InternalSceneDl.g:321:7: (lv_features_12_0= ruleFeature )
                    	    // InternalSceneDl.g:322:8: lv_features_12_0= ruleFeature
                    	    {

                    	    								newCompositeNode(grammarAccess.getStaticEntityAccess().getFeaturesFeatureParserRuleCall_4_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
                    	    lv_features_12_0=ruleFeature();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getStaticEntityRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"features",
                    	    									lv_features_12_0,
                    	    									"event.driven.SceneDl.Feature");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getStaticEntityAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticEntity"


    // $ANTLR start "entryRuleDynamicEntity"
    // InternalSceneDl.g:350:1: entryRuleDynamicEntity returns [EObject current=null] : iv_ruleDynamicEntity= ruleDynamicEntity EOF ;
    public final EObject entryRuleDynamicEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicEntity = null;


        try {
            // InternalSceneDl.g:350:54: (iv_ruleDynamicEntity= ruleDynamicEntity EOF )
            // InternalSceneDl.g:351:2: iv_ruleDynamicEntity= ruleDynamicEntity EOF
            {
             newCompositeNode(grammarAccess.getDynamicEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicEntity=ruleDynamicEntity();

            state._fsp--;

             current =iv_ruleDynamicEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicEntity"


    // $ANTLR start "ruleDynamicEntity"
    // InternalSceneDl.g:357:1: ruleDynamicEntity returns [EObject current=null] : ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleDynamicEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_contains_8_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_contains_12_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:363:2: ( ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )? ) )
            // InternalSceneDl.g:364:2: ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )? )
            {
            // InternalSceneDl.g:364:2: ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )? )
            // InternalSceneDl.g:365:3: ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )?
            {
            // InternalSceneDl.g:365:3: ( (lv_type_0_0= 'dynamic_entity' ) )
            // InternalSceneDl.g:366:4: (lv_type_0_0= 'dynamic_entity' )
            {
            // InternalSceneDl.g:366:4: (lv_type_0_0= 'dynamic_entity' )
            // InternalSceneDl.g:367:5: lv_type_0_0= 'dynamic_entity'
            {
            lv_type_0_0=(Token)match(input,17,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicEntityRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "dynamic_entity");
            				

            }


            }

            // InternalSceneDl.g:379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSceneDl.g:380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSceneDl.g:380:4: (lv_name_1_0= RULE_ID )
            // InternalSceneDl.g:381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDynamicEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSceneDl.g:397:3: (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDl.g:398:4: otherlv_2= 'key' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicEntityAccess().getKeyKeyword_2_0());
                    			
                    // InternalSceneDl.g:402:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSceneDl.g:403:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSceneDl.g:403:5: (otherlv_3= RULE_ID )
                    // InternalSceneDl.g:404:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getDynamicEntityAccess().getKeyAttributeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDl.g:416:3: (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSceneDl.g:417:4: otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDynamicEntityAccess().getIsAKeyword_3_0());
            	    			
            	    // InternalSceneDl.g:421:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSceneDl.g:422:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSceneDl.g:422:5: (otherlv_5= RULE_ID )
            	    // InternalSceneDl.g:423:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDynamicEntityRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(otherlv_5, grammarAccess.getDynamicEntityAccess().getIsAElementCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalSceneDl.g:435:3: (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDl.g:436:4: otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getDynamicEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSceneDl.g:440:4: ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (lv_contains_8_0= ruleContain ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==19) ) {
                            int LA10_3 = input.LA(3);

                            if ( ((LA10_3>=26 && LA10_3<=27)) ) {
                                alt10=1;
                            }
                            else if ( (LA10_3==RULE_ID) ) {
                                alt10=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_0==18) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSceneDl.g:441:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            {
                            // InternalSceneDl.g:441:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            // InternalSceneDl.g:442:6: (lv_attributes_7_0= ruleAttribute )
                            {
                            // InternalSceneDl.g:442:6: (lv_attributes_7_0= ruleAttribute )
                            // InternalSceneDl.g:443:7: lv_attributes_7_0= ruleAttribute
                            {

                            							newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_attributes_7_0=ruleAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                            							}
                            							add(
                            								current,
                            								"attributes",
                            								lv_attributes_7_0,
                            								"event.driven.SceneDl.Attribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSceneDl.g:461:5: ( (lv_contains_8_0= ruleContain ) )
                            {
                            // InternalSceneDl.g:461:5: ( (lv_contains_8_0= ruleContain ) )
                            // InternalSceneDl.g:462:6: (lv_contains_8_0= ruleContain )
                            {
                            // InternalSceneDl.g:462:6: (lv_contains_8_0= ruleContain )
                            // InternalSceneDl.g:463:7: lv_contains_8_0= ruleContain
                            {

                            							newCompositeNode(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_contains_8_0=ruleContain();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                            							}
                            							add(
                            								current,
                            								"contains",
                            								lv_contains_8_0,
                            								"event.driven.SceneDl.Contain");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSceneDl.g:481:4: ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==RULE_ID) ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3==19) ) {
                                    int LA11_5 = input.LA(4);

                                    if ( (LA11_5==RULE_ID) ) {
                                        alt11=2;
                                    }
                                    else if ( ((LA11_5>=26 && LA11_5<=27)) ) {
                                        alt11=1;
                                    }


                                }


                            }
                            else if ( (LA11_2==18) ) {
                                alt11=2;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSceneDl.g:482:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    {
                    	    // InternalSceneDl.g:482:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    // InternalSceneDl.g:483:6: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0_0());
                    	    					
                    	    // InternalSceneDl.g:487:6: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    // InternalSceneDl.g:488:7: (lv_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalSceneDl.g:488:7: (lv_attributes_10_0= ruleAttribute )
                    	    // InternalSceneDl.g:489:8: lv_attributes_10_0= ruleAttribute
                    	    {

                    	    								newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"attributes",
                    	    									lv_attributes_10_0,
                    	    									"event.driven.SceneDl.Attribute");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSceneDl.g:508:5: (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) )
                    	    {
                    	    // InternalSceneDl.g:508:5: (otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) ) )
                    	    // InternalSceneDl.g:509:6: otherlv_11= ',' ( (lv_contains_12_0= ruleContain ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalSceneDl.g:513:6: ( (lv_contains_12_0= ruleContain ) )
                    	    // InternalSceneDl.g:514:7: (lv_contains_12_0= ruleContain )
                    	    {
                    	    // InternalSceneDl.g:514:7: (lv_contains_12_0= ruleContain )
                    	    // InternalSceneDl.g:515:8: lv_contains_12_0= ruleContain
                    	    {

                    	    								newCompositeNode(grammarAccess.getDynamicEntityAccess().getContainsContainParserRuleCall_4_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
                    	    lv_contains_12_0=ruleContain();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"contains",
                    	    									lv_contains_12_0,
                    	    									"event.driven.SceneDl.Contain");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDynamicEntityAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalSceneDl.g:543:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalSceneDl.g:543:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalSceneDl.g:544:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalSceneDl.g:550:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSceneDl.g:556:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSceneDl.g:557:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSceneDl.g:557:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalSceneDl.g:558:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSceneDl.g:558:3: ( (lv_many_0_0= 'many' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSceneDl.g:559:4: (lv_many_0_0= 'many' )
                    {
                    // InternalSceneDl.g:559:4: (lv_many_0_0= 'many' )
                    // InternalSceneDl.g:560:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalSceneDl.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSceneDl.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSceneDl.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalSceneDl.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
            		
            // InternalSceneDl.g:594:3: ( (otherlv_3= RULE_ID ) )
            // InternalSceneDl.g:595:4: (otherlv_3= RULE_ID )
            {
            // InternalSceneDl.g:595:4: (otherlv_3= RULE_ID )
            // InternalSceneDl.g:596:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeElementCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleContain"
    // InternalSceneDl.g:611:1: entryRuleContain returns [EObject current=null] : iv_ruleContain= ruleContain EOF ;
    public final EObject entryRuleContain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContain = null;


        try {
            // InternalSceneDl.g:611:48: (iv_ruleContain= ruleContain EOF )
            // InternalSceneDl.g:612:2: iv_ruleContain= ruleContain EOF
            {
             newCompositeNode(grammarAccess.getContainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContain=ruleContain();

            state._fsp--;

             current =iv_ruleContain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContain"


    // $ANTLR start "ruleContain"
    // InternalSceneDl.g:618:1: ruleContain returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleContain() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSceneDl.g:624:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSceneDl.g:625:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSceneDl.g:625:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalSceneDl.g:626:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSceneDl.g:626:3: ( (lv_many_0_0= 'many' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDl.g:627:4: (lv_many_0_0= 'many' )
                    {
                    // InternalSceneDl.g:627:4: (lv_many_0_0= 'many' )
                    // InternalSceneDl.g:628:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getContainAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalSceneDl.g:640:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSceneDl.g:641:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSceneDl.g:641:4: (lv_name_1_0= RULE_ID )
            // InternalSceneDl.g:642:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContainAccess().getColonKeyword_2());
            		
            // InternalSceneDl.g:662:3: ( (otherlv_3= RULE_ID ) )
            // InternalSceneDl.g:663:4: (otherlv_3= RULE_ID )
            {
            // InternalSceneDl.g:663:4: (otherlv_3= RULE_ID )
            // InternalSceneDl.g:664:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getContainAccess().getTypeDynamicEntityCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContain"


    // $ANTLR start "entryRuleAttribute"
    // InternalSceneDl.g:679:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSceneDl.g:679:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSceneDl.g:680:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSceneDl.g:686:1: ruleAttribute returns [EObject current=null] : (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_RegularAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:692:2: ( (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute ) )
            // InternalSceneDl.g:693:2: (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute )
            {
            // InternalSceneDl.g:693:2: (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==19) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==26) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==20) ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5==RULE_INT) ) {
                                int LA15_7 = input.LA(6);

                                if ( (LA15_7==24) ) {
                                    alt15=2;
                                }
                                else if ( (LA15_7==EOF||(LA15_7>=15 && LA15_7<=16)||(LA15_7>=21 && LA15_7<=23)||LA15_7==25) ) {
                                    alt15=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA15_5==RULE_STRING) ) {
                                alt15=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA15_3>=RULE_INT && LA15_3<=RULE_STRING)) ) {
                            alt15=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_2==27) ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4==20) ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5==RULE_INT) ) {
                                int LA15_7 = input.LA(6);

                                if ( (LA15_7==24) ) {
                                    alt15=2;
                                }
                                else if ( (LA15_7==EOF||(LA15_7>=15 && LA15_7<=16)||(LA15_7>=21 && LA15_7<=23)||LA15_7==25) ) {
                                    alt15=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 15, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA15_5==RULE_STRING) ) {
                                alt15=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA15_4>=RULE_INT && LA15_4<=RULE_STRING)) ) {
                            alt15=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSceneDl.g:694:3: this_RegularAttribute_0= ruleRegularAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getRegularAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularAttribute_0=ruleRegularAttribute();

                    state._fsp--;


                    			current = this_RegularAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:703:3: this_PositionAttribute_1= rulePositionAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositionAttribute_1=rulePositionAttribute();

                    state._fsp--;


                    			current = this_PositionAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRegularAttribute"
    // InternalSceneDl.g:715:1: entryRuleRegularAttribute returns [EObject current=null] : iv_ruleRegularAttribute= ruleRegularAttribute EOF ;
    public final EObject entryRuleRegularAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularAttribute = null;


        try {
            // InternalSceneDl.g:715:57: (iv_ruleRegularAttribute= ruleRegularAttribute EOF )
            // InternalSceneDl.g:716:2: iv_ruleRegularAttribute= ruleRegularAttribute EOF
            {
             newCompositeNode(grammarAccess.getRegularAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularAttribute=ruleRegularAttribute();

            state._fsp--;

             current =iv_ruleRegularAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularAttribute"


    // $ANTLR start "ruleRegularAttribute"
    // InternalSceneDl.g:722:1: ruleRegularAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? ) ;
    public final EObject ruleRegularAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_isTransient_8_0=null;
        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:728:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? ) )
            // InternalSceneDl.g:729:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? )
            {
            // InternalSceneDl.g:729:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? )
            // InternalSceneDl.g:730:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )?
            {
            // InternalSceneDl.g:730:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSceneDl.g:731:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSceneDl.g:731:4: (lv_name_0_0= RULE_ID )
            // InternalSceneDl.g:732:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRegularAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegularAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularAttributeAccess().getColonKeyword_1());
            		
            // InternalSceneDl.g:752:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalSceneDl.g:753:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalSceneDl.g:753:4: (lv_type_2_0= ruleAttributeType )
            // InternalSceneDl.g:754:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getRegularAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"event.driven.SceneDl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSceneDl.g:771:3: (otherlv_3= '[' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDl.g:772:4: otherlv_3= '['
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSceneDl.g:777:3: ( (lv_value_4_0= ruleAttributeValue ) )
            // InternalSceneDl.g:778:4: (lv_value_4_0= ruleAttributeValue )
            {
            // InternalSceneDl.g:778:4: (lv_value_4_0= ruleAttributeValue )
            // InternalSceneDl.g:779:5: lv_value_4_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_4_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_4_0,
            						"event.driven.SceneDl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSceneDl.g:796:3: (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSceneDl.g:797:4: otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegularAttributeAccess().getHyphenMinusKeyword_5_0());
                    			
                    // InternalSceneDl.g:801:4: ( (lv_value_6_0= ruleAttributeValue ) )
                    // InternalSceneDl.g:802:5: (lv_value_6_0= ruleAttributeValue )
                    {
                    // InternalSceneDl.g:802:5: (lv_value_6_0= ruleAttributeValue )
                    // InternalSceneDl.g:803:6: lv_value_6_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_value_6_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"event.driven.SceneDl.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDl.g:821:3: (otherlv_7= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDl.g:822:4: otherlv_7= ']'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSceneDl.g:827:3: ( (lv_isTransient_8_0= 'transient' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDl.g:828:4: (lv_isTransient_8_0= 'transient' )
                    {
                    // InternalSceneDl.g:828:4: (lv_isTransient_8_0= 'transient' )
                    // InternalSceneDl.g:829:5: lv_isTransient_8_0= 'transient'
                    {
                    lv_isTransient_8_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_isTransient_8_0, grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRegularAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isTransient", lv_isTransient_8_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularAttribute"


    // $ANTLR start "entryRulePositionAttribute"
    // InternalSceneDl.g:845:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // InternalSceneDl.g:845:58: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // InternalSceneDl.g:846:2: iv_rulePositionAttribute= rulePositionAttribute EOF
            {
             newCompositeNode(grammarAccess.getPositionAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionAttribute=rulePositionAttribute();

            state._fsp--;

             current =iv_rulePositionAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionAttribute"


    // $ANTLR start "rulePositionAttribute"
    // InternalSceneDl.g:852:1: rulePositionAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? ) ;
    public final EObject rulePositionAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;
        Token lv_isTransient_8_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:858:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? ) )
            // InternalSceneDl.g:859:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? )
            {
            // InternalSceneDl.g:859:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? )
            // InternalSceneDl.g:860:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )?
            {
            // InternalSceneDl.g:860:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSceneDl.g:861:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSceneDl.g:861:4: (lv_name_0_0= RULE_ID )
            // InternalSceneDl.g:862:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPositionAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getColonKeyword_1());
            		
            // InternalSceneDl.g:882:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalSceneDl.g:883:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalSceneDl.g:883:4: (lv_type_2_0= ruleAttributeType )
            // InternalSceneDl.g:884:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getPositionAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"event.driven.SceneDl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalSceneDl.g:905:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSceneDl.g:906:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSceneDl.g:906:4: (lv_x_4_0= RULE_INT )
            // InternalSceneDl.g:907:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_x_4_0, grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_5());
            		
            // InternalSceneDl.g:927:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSceneDl.g:928:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSceneDl.g:928:4: (lv_y_6_0= RULE_INT )
            // InternalSceneDl.g:929:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_y_6_0, grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_7());
            		
            // InternalSceneDl.g:949:3: ( (lv_isTransient_8_0= 'transient' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSceneDl.g:950:4: (lv_isTransient_8_0= 'transient' )
                    {
                    // InternalSceneDl.g:950:4: (lv_isTransient_8_0= 'transient' )
                    // InternalSceneDl.g:951:5: lv_isTransient_8_0= 'transient'
                    {
                    lv_isTransient_8_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_isTransient_8_0, grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPositionAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isTransient", lv_isTransient_8_0 != null, "transient");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalSceneDl.g:967:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalSceneDl.g:967:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalSceneDl.g:968:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalSceneDl.g:974:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalSceneDl.g:980:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) )
            // InternalSceneDl.g:981:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            {
            // InternalSceneDl.g:981:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==25) ) {
                    alt21=3;
                }
                else if ( (LA21_1==EOF||(LA21_1>=15 && LA21_1<=16)||(LA21_1>=21 && LA21_1<=23)) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSceneDl.g:982:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:990:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSceneDl.g:998:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    {
                    // InternalSceneDl.g:998:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    // InternalSceneDl.g:999:4: this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_19); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_0());
                    			
                    kw=(Token)match(input,25,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAttributeValueAccess().getFullStopKeyword_2_1());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "ruleAttributeType"
    // InternalSceneDl.g:1023:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSceneDl.g:1029:2: ( ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) ) )
            // InternalSceneDl.g:1030:2: ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) )
            {
            // InternalSceneDl.g:1030:2: ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            else if ( (LA22_0==27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSceneDl.g:1031:3: (enumLiteral_0= 'range' )
                    {
                    // InternalSceneDl.g:1031:3: (enumLiteral_0= 'range' )
                    // InternalSceneDl.g:1032:4: enumLiteral_0= 'range'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:1039:3: (enumLiteral_1= 'value' )
                    {
                    // InternalSceneDl.g:1039:3: (enumLiteral_1= 'value' )
                    // InternalSceneDl.g:1040:4: enumLiteral_1= 'value'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});

}