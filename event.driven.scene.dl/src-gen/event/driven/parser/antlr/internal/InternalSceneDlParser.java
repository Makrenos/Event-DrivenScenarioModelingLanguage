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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'static_entity'", "'key'", "'isA'", "'{'", "','", "'}'", "'dynamic_entity'", "':'", "'['", "'-'", "']'", "'transient'", "';'", "'.'", "'range'", "'value'"
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
    // InternalSceneDl.g:164:1: ruleStaticEntity returns [EObject current=null] : ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleStaticEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_10_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:170:2: ( ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )? ) )
            // InternalSceneDl.g:171:2: ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )? )
            {
            // InternalSceneDl.g:171:2: ( ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )? )
            // InternalSceneDl.g:172:3: ( (lv_type_0_0= 'static_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )?
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

            // InternalSceneDl.g:242:3: (otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSceneDl.g:243:4: otherlv_6= '{' ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) ) ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )* otherlv_13= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getStaticEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSceneDl.g:247:4: ( ( (lv_attributes_7_0= ruleAttribute ) ) | ( (otherlv_8= RULE_ID ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==18) ) {
                            alt5=1;
                        }
                        else if ( ((LA5_1>=15 && LA5_1<=16)) ) {
                            alt5=2;
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
                            // InternalSceneDl.g:248:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            {
                            // InternalSceneDl.g:248:5: ( (lv_attributes_7_0= ruleAttribute ) )
                            // InternalSceneDl.g:249:6: (lv_attributes_7_0= ruleAttribute )
                            {
                            // InternalSceneDl.g:249:6: (lv_attributes_7_0= ruleAttribute )
                            // InternalSceneDl.g:250:7: lv_attributes_7_0= ruleAttribute
                            {

                            							newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_7);
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
                            // InternalSceneDl.g:268:5: ( (otherlv_8= RULE_ID ) )
                            {
                            // InternalSceneDl.g:268:5: ( (otherlv_8= RULE_ID ) )
                            // InternalSceneDl.g:269:6: (otherlv_8= RULE_ID )
                            {
                            // InternalSceneDl.g:269:6: (otherlv_8= RULE_ID )
                            // InternalSceneDl.g:270:7: otherlv_8= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getStaticEntityRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                            							newLeafNode(otherlv_8, grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSceneDl.g:282:4: ( (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) ) | (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==RULE_ID) ) {
                                int LA6_3 = input.LA(3);

                                if ( ((LA6_3>=15 && LA6_3<=16)) ) {
                                    alt6=2;
                                }
                                else if ( (LA6_3==18) ) {
                                    alt6=1;
                                }


                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSceneDl.g:283:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    {
                    	    // InternalSceneDl.g:283:5: (otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) ) )
                    	    // InternalSceneDl.g:284:6: otherlv_9= ',' ( (lv_attributes_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_0_0());
                    	    					
                    	    // InternalSceneDl.g:288:6: ( (lv_attributes_10_0= ruleAttribute ) )
                    	    // InternalSceneDl.g:289:7: (lv_attributes_10_0= ruleAttribute )
                    	    {
                    	    // InternalSceneDl.g:289:7: (lv_attributes_10_0= ruleAttribute )
                    	    // InternalSceneDl.g:290:8: lv_attributes_10_0= ruleAttribute
                    	    {

                    	    								newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0());
                    	    							
                    	    pushFollow(FOLLOW_7);
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
                    	    // InternalSceneDl.g:309:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )
                    	    {
                    	    // InternalSceneDl.g:309:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )
                    	    // InternalSceneDl.g:310:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalSceneDl.g:314:6: ( (otherlv_12= RULE_ID ) )
                    	    // InternalSceneDl.g:315:7: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalSceneDl.g:315:7: (otherlv_12= RULE_ID )
                    	    // InternalSceneDl.g:316:8: otherlv_12= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getStaticEntityRule());
                    	    								}
                    	    							
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    								newLeafNode(otherlv_12, grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_2_1_1_0());
                    	    							

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
    // InternalSceneDl.g:338:1: entryRuleDynamicEntity returns [EObject current=null] : iv_ruleDynamicEntity= ruleDynamicEntity EOF ;
    public final EObject entryRuleDynamicEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicEntity = null;


        try {
            // InternalSceneDl.g:338:54: (iv_ruleDynamicEntity= ruleDynamicEntity EOF )
            // InternalSceneDl.g:339:2: iv_ruleDynamicEntity= ruleDynamicEntity EOF
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
    // InternalSceneDl.g:345:1: ruleDynamicEntity returns [EObject current=null] : ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleDynamicEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:351:2: ( ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? ) )
            // InternalSceneDl.g:352:2: ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? )
            {
            // InternalSceneDl.g:352:2: ( ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )? )
            // InternalSceneDl.g:353:3: ( (lv_type_0_0= 'dynamic_entity' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )* (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            {
            // InternalSceneDl.g:353:3: ( (lv_type_0_0= 'dynamic_entity' ) )
            // InternalSceneDl.g:354:4: (lv_type_0_0= 'dynamic_entity' )
            {
            // InternalSceneDl.g:354:4: (lv_type_0_0= 'dynamic_entity' )
            // InternalSceneDl.g:355:5: lv_type_0_0= 'dynamic_entity'
            {
            lv_type_0_0=(Token)match(input,17,FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDynamicEntityRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "dynamic_entity");
            				

            }


            }

            // InternalSceneDl.g:367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSceneDl.g:368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSceneDl.g:368:4: (lv_name_1_0= RULE_ID )
            // InternalSceneDl.g:369:5: lv_name_1_0= RULE_ID
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

            // InternalSceneDl.g:385:3: (otherlv_2= 'key' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDl.g:386:4: otherlv_2= 'key' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicEntityAccess().getKeyKeyword_2_0());
                    			
                    // InternalSceneDl.g:390:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSceneDl.g:391:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSceneDl.g:391:5: (otherlv_3= RULE_ID )
                    // InternalSceneDl.g:392:6: otherlv_3= RULE_ID
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

            // InternalSceneDl.g:404:3: (otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSceneDl.g:405:4: otherlv_4= 'isA' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDynamicEntityAccess().getIsAKeyword_3_0());
            	    			
            	    // InternalSceneDl.g:409:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalSceneDl.g:410:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalSceneDl.g:410:5: (otherlv_5= RULE_ID )
            	    // InternalSceneDl.g:411:6: otherlv_5= RULE_ID
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

            // InternalSceneDl.g:423:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSceneDl.g:424:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDynamicEntityAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSceneDl.g:428:4: ( (lv_attributes_7_0= ruleAttribute ) )
                    // InternalSceneDl.g:429:5: (lv_attributes_7_0= ruleAttribute )
                    {
                    // InternalSceneDl.g:429:5: (lv_attributes_7_0= ruleAttribute )
                    // InternalSceneDl.g:430:6: lv_attributes_7_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalSceneDl.g:447:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSceneDl.g:448:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSceneDl.g:452:5: ( (lv_attributes_9_0= ruleAttribute ) )
                    	    // InternalSceneDl.g:453:6: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalSceneDl.g:453:6: (lv_attributes_9_0= ruleAttribute )
                    	    // InternalSceneDl.g:454:7: lv_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"event.driven.SceneDl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getDynamicEntityAccess().getRightCurlyBracketKeyword_4_3());
                    			

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


    // $ANTLR start "entryRuleAttribute"
    // InternalSceneDl.g:481:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSceneDl.g:481:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSceneDl.g:482:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSceneDl.g:488:1: ruleAttribute returns [EObject current=null] : (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_RegularAttribute_0 = null;

        EObject this_PositionAttribute_1 = null;



        	enterRule();

        try {
            // InternalSceneDl.g:494:2: ( (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute ) )
            // InternalSceneDl.g:495:2: (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute )
            {
            // InternalSceneDl.g:495:2: (this_RegularAttribute_0= ruleRegularAttribute | this_PositionAttribute_1= rulePositionAttribute )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==18) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==25) ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3==19) ) {
                            int LA12_5 = input.LA(5);

                            if ( (LA12_5==RULE_INT) ) {
                                int LA12_7 = input.LA(6);

                                if ( (LA12_7==EOF||(LA12_7>=15 && LA12_7<=16)||(LA12_7>=20 && LA12_7<=22)||LA12_7==24) ) {
                                    alt12=1;
                                }
                                else if ( (LA12_7==23) ) {
                                    alt12=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 12, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA12_5==RULE_STRING) ) {
                                alt12=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA12_3>=RULE_INT && LA12_3<=RULE_STRING)) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_2==26) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==19) ) {
                            int LA12_5 = input.LA(5);

                            if ( (LA12_5==RULE_INT) ) {
                                int LA12_7 = input.LA(6);

                                if ( (LA12_7==EOF||(LA12_7>=15 && LA12_7<=16)||(LA12_7>=20 && LA12_7<=22)||LA12_7==24) ) {
                                    alt12=1;
                                }
                                else if ( (LA12_7==23) ) {
                                    alt12=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 12, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA12_5==RULE_STRING) ) {
                                alt12=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA12_4>=RULE_INT && LA12_4<=RULE_STRING)) ) {
                            alt12=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDl.g:496:3: this_RegularAttribute_0= ruleRegularAttribute
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
                    // InternalSceneDl.g:505:3: this_PositionAttribute_1= rulePositionAttribute
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
    // InternalSceneDl.g:517:1: entryRuleRegularAttribute returns [EObject current=null] : iv_ruleRegularAttribute= ruleRegularAttribute EOF ;
    public final EObject entryRuleRegularAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularAttribute = null;


        try {
            // InternalSceneDl.g:517:57: (iv_ruleRegularAttribute= ruleRegularAttribute EOF )
            // InternalSceneDl.g:518:2: iv_ruleRegularAttribute= ruleRegularAttribute EOF
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
    // InternalSceneDl.g:524:1: ruleRegularAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? ) ;
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
            // InternalSceneDl.g:530:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? ) )
            // InternalSceneDl.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? )
            {
            // InternalSceneDl.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )? )
            // InternalSceneDl.g:532:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= '[' )? ( (lv_value_4_0= ruleAttributeValue ) ) (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )? (otherlv_7= ']' )? ( (lv_isTransient_8_0= 'transient' ) )?
            {
            // InternalSceneDl.g:532:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSceneDl.g:533:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSceneDl.g:533:4: (lv_name_0_0= RULE_ID )
            // InternalSceneDl.g:534:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularAttributeAccess().getColonKeyword_1());
            		
            // InternalSceneDl.g:554:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalSceneDl.g:555:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalSceneDl.g:555:4: (lv_type_2_0= ruleAttributeType )
            // InternalSceneDl.g:556:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getRegularAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalSceneDl.g:573:3: (otherlv_3= '[' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSceneDl.g:574:4: otherlv_3= '['
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSceneDl.g:579:3: ( (lv_value_4_0= ruleAttributeValue ) )
            // InternalSceneDl.g:580:4: (lv_value_4_0= ruleAttributeValue )
            {
            // InternalSceneDl.g:580:4: (lv_value_4_0= ruleAttributeValue )
            // InternalSceneDl.g:581:5: lv_value_4_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalSceneDl.g:598:3: (otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDl.g:599:4: otherlv_5= '-' ( (lv_value_6_0= ruleAttributeValue ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getRegularAttributeAccess().getHyphenMinusKeyword_5_0());
                    			
                    // InternalSceneDl.g:603:4: ( (lv_value_6_0= ruleAttributeValue ) )
                    // InternalSceneDl.g:604:5: (lv_value_6_0= ruleAttributeValue )
                    {
                    // InternalSceneDl.g:604:5: (lv_value_6_0= ruleAttributeValue )
                    // InternalSceneDl.g:605:6: lv_value_6_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            // InternalSceneDl.g:623:3: (otherlv_7= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSceneDl.g:624:4: otherlv_7= ']'
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6());
                    			

                    }
                    break;

            }

            // InternalSceneDl.g:629:3: ( (lv_isTransient_8_0= 'transient' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDl.g:630:4: (lv_isTransient_8_0= 'transient' )
                    {
                    // InternalSceneDl.g:630:4: (lv_isTransient_8_0= 'transient' )
                    // InternalSceneDl.g:631:5: lv_isTransient_8_0= 'transient'
                    {
                    lv_isTransient_8_0=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSceneDl.g:647:1: entryRulePositionAttribute returns [EObject current=null] : iv_rulePositionAttribute= rulePositionAttribute EOF ;
    public final EObject entryRulePositionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionAttribute = null;


        try {
            // InternalSceneDl.g:647:58: (iv_rulePositionAttribute= rulePositionAttribute EOF )
            // InternalSceneDl.g:648:2: iv_rulePositionAttribute= rulePositionAttribute EOF
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
    // InternalSceneDl.g:654:1: rulePositionAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? ) ;
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
            // InternalSceneDl.g:660:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? ) )
            // InternalSceneDl.g:661:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? )
            {
            // InternalSceneDl.g:661:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )? )
            // InternalSceneDl.g:662:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) otherlv_3= '[' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ';' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ']' ( (lv_isTransient_8_0= 'transient' ) )?
            {
            // InternalSceneDl.g:662:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSceneDl.g:663:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSceneDl.g:663:4: (lv_name_0_0= RULE_ID )
            // InternalSceneDl.g:664:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getColonKeyword_1());
            		
            // InternalSceneDl.g:684:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalSceneDl.g:685:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalSceneDl.g:685:4: (lv_type_2_0= ruleAttributeType )
            // InternalSceneDl.g:686:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getPositionAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalSceneDl.g:707:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalSceneDl.g:708:4: (lv_x_4_0= RULE_INT )
            {
            // InternalSceneDl.g:708:4: (lv_x_4_0= RULE_INT )
            // InternalSceneDl.g:709:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_5=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_5());
            		
            // InternalSceneDl.g:729:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalSceneDl.g:730:4: (lv_y_6_0= RULE_INT )
            {
            // InternalSceneDl.g:730:4: (lv_y_6_0= RULE_INT )
            // InternalSceneDl.g:731:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_7=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_7());
            		
            // InternalSceneDl.g:751:3: ( (lv_isTransient_8_0= 'transient' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSceneDl.g:752:4: (lv_isTransient_8_0= 'transient' )
                    {
                    // InternalSceneDl.g:752:4: (lv_isTransient_8_0= 'transient' )
                    // InternalSceneDl.g:753:5: lv_isTransient_8_0= 'transient'
                    {
                    lv_isTransient_8_0=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSceneDl.g:769:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalSceneDl.g:769:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalSceneDl.g:770:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalSceneDl.g:776:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalSceneDl.g:782:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ) )
            // InternalSceneDl.g:783:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            {
            // InternalSceneDl.g:783:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1>=15 && LA18_1<=16)||(LA18_1>=20 && LA18_1<=22)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==24) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDl.g:784:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:792:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSceneDl.g:800:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    {
                    // InternalSceneDl.g:800:3: (this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    // InternalSceneDl.g:801:4: this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_0());
                    			
                    kw=(Token)match(input,24,FOLLOW_15); 

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
    // InternalSceneDl.g:825:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSceneDl.g:831:2: ( ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) ) )
            // InternalSceneDl.g:832:2: ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) )
            {
            // InternalSceneDl.g:832:2: ( (enumLiteral_0= 'range' ) | (enumLiteral_1= 'value' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==26) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDl.g:833:3: (enumLiteral_0= 'range' )
                    {
                    // InternalSceneDl.g:833:3: (enumLiteral_0= 'range' )
                    // InternalSceneDl.g:834:4: enumLiteral_0= 'range'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSceneDl.g:841:3: (enumLiteral_1= 'value' )
                    {
                    // InternalSceneDl.g:841:3: (enumLiteral_1= 'value' )
                    // InternalSceneDl.g:842:4: enumLiteral_1= 'value'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}