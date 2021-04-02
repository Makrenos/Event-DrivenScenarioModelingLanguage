/*
 * generated by Xtext 2.25.0
 */
grammar InternalSceneDl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package event.driven.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleScene
entryRuleScene returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSceneRule()); }
	iv_ruleScene=ruleScene
	{ $current=$iv_ruleScene.current; }
	EOF;

// Rule Scene
ruleScene returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSceneRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSceneAccess().getElementsElementParserRuleCall_1_0());
				}
				lv_elements_1_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSceneRule());
					}
					add(
						$current,
						"elements",
						lv_elements_1_0,
						"event.driven.SceneDl.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementAccess().getStaticEntityParserRuleCall_0());
		}
		this_StaticEntity_0=ruleStaticEntity
		{
			$current = $this_StaticEntity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getDynamicEntityParserRuleCall_1());
		}
		this_DynamicEntity_1=ruleDynamicEntity
		{
			$current = $this_DynamicEntity_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStaticEntity
entryRuleStaticEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStaticEntityRule()); }
	iv_ruleStaticEntity=ruleStaticEntity
	{ $current=$iv_ruleStaticEntity.current; }
	EOF;

// Rule StaticEntity
ruleStaticEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='static_entity'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getStaticEntityAccess().getTypeStatic_entityKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStaticEntityRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "static_entity");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStaticEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStaticEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='key'
			{
				newLeafNode(otherlv_2, grammarAccess.getStaticEntityAccess().getKeyKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStaticEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getStaticEntityAccess().getKeyAttributeCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='isA'
			{
				newLeafNode(otherlv_4, grammarAccess.getStaticEntityAccess().getIsAKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStaticEntityRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getStaticEntityAccess().getIsAElementCrossReference_3_1_0());
					}
				)
			)
		)*
		(
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getStaticEntityAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_1_0_0());
						}
						lv_attributes_7_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStaticEntityRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_7_0,
								"event.driven.SceneDl.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStaticEntityRule());
							}
						}
						otherlv_8=RULE_ID
						{
							newLeafNode(otherlv_8, grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_1_1_0());
						}
					)
				)
			)
			(
				(
					otherlv_9=','
					{
						newLeafNode(otherlv_9, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getStaticEntityAccess().getAttributesAttributeParserRuleCall_4_2_0_1_0());
							}
							lv_attributes_10_0=ruleAttribute
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStaticEntityRule());
								}
								add(
									$current,
									"attributes",
									lv_attributes_10_0,
									"event.driven.SceneDl.Attribute");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				    |
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getStaticEntityAccess().getCommaKeyword_4_2_1_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getStaticEntityRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getStaticEntityAccess().getFeaturesDynamicEntityCrossReference_4_2_1_1_0());
							}
						)
					)
				)
			)*
			otherlv_13='}'
			{
				newLeafNode(otherlv_13, grammarAccess.getStaticEntityAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleDynamicEntity
entryRuleDynamicEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDynamicEntityRule()); }
	iv_ruleDynamicEntity=ruleDynamicEntity
	{ $current=$iv_ruleDynamicEntity.current; }
	EOF;

// Rule DynamicEntity
ruleDynamicEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='dynamic_entity'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getDynamicEntityAccess().getTypeDynamic_entityKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDynamicEntityRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "dynamic_entity");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDynamicEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDynamicEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='key'
			{
				newLeafNode(otherlv_2, grammarAccess.getDynamicEntityAccess().getKeyKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDynamicEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getDynamicEntityAccess().getKeyAttributeCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='isA'
			{
				newLeafNode(otherlv_4, grammarAccess.getDynamicEntityAccess().getIsAKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDynamicEntityRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getDynamicEntityAccess().getIsAElementCrossReference_3_1_0());
					}
				)
			)
		)*
		(
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getDynamicEntityAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_1_0());
					}
					lv_attributes_7_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_7_0,
							"event.driven.SceneDl.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getDynamicEntityAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDynamicEntityAccess().getAttributesAttributeParserRuleCall_4_2_1_0());
						}
						lv_attributes_9_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDynamicEntityRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_9_0,
								"event.driven.SceneDl.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getDynamicEntityAccess().getRightCurlyBracketKeyword_4_3());
			}
		)?
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAttributeAccess().getRegularAttributeParserRuleCall_0());
		}
		this_RegularAttribute_0=ruleRegularAttribute
		{
			$current = $this_RegularAttribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAttributeAccess().getPositionAttributeParserRuleCall_1());
		}
		this_PositionAttribute_1=rulePositionAttribute
		{
			$current = $this_PositionAttribute_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRegularAttribute
entryRuleRegularAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegularAttributeRule()); }
	iv_ruleRegularAttribute=ruleRegularAttribute
	{ $current=$iv_ruleRegularAttribute.current; }
	EOF;

// Rule RegularAttribute
ruleRegularAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getRegularAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getRegularAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"event.driven.SceneDl.AttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getRegularAttributeAccess().getLeftSquareBracketKeyword_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_4_0());
				}
				lv_value_4_0=ruleAttributeValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
					}
					add(
						$current,
						"value",
						lv_value_4_0,
						"event.driven.SceneDl.AttributeValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='-'
			{
				newLeafNode(otherlv_5, grammarAccess.getRegularAttributeAccess().getHyphenMinusKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRegularAttributeAccess().getValueAttributeValueParserRuleCall_5_1_0());
					}
					lv_value_6_0=ruleAttributeValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRegularAttributeRule());
						}
						add(
							$current,
							"value",
							lv_value_6_0,
							"event.driven.SceneDl.AttributeValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getRegularAttributeAccess().getRightSquareBracketKeyword_6());
			}
		)?
		(
			(
				lv_isTransient_8_0='transient'
				{
					newLeafNode(lv_isTransient_8_0, grammarAccess.getRegularAttributeAccess().getIsTransientTransientKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularAttributeRule());
					}
					setWithLastConsumed($current, "isTransient", lv_isTransient_8_0 != null, "transient");
				}
			)
		)?
	)
;

// Entry rule entryRulePositionAttribute
entryRulePositionAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPositionAttributeRule()); }
	iv_rulePositionAttribute=rulePositionAttribute
	{ $current=$iv_rulePositionAttribute.current; }
	EOF;

// Rule PositionAttribute
rulePositionAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPositionAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPositionAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPositionAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPositionAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"event.driven.SceneDl.AttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getPositionAttributeAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				lv_x_4_0=RULE_INT
				{
					newLeafNode(lv_x_4_0, grammarAccess.getPositionAttributeAccess().getXINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getPositionAttributeAccess().getSemicolonKeyword_5());
		}
		(
			(
				lv_y_6_0=RULE_INT
				{
					newLeafNode(lv_y_6_0, grammarAccess.getPositionAttributeAccess().getYINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getPositionAttributeAccess().getRightSquareBracketKeyword_7());
		}
		(
			(
				lv_isTransient_8_0='transient'
				{
					newLeafNode(lv_isTransient_8_0, grammarAccess.getPositionAttributeAccess().getIsTransientTransientKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPositionAttributeRule());
					}
					setWithLastConsumed($current, "isTransient", lv_isTransient_8_0 != null, "transient");
				}
			)
		)?
	)
;

// Entry rule entryRuleAttributeValue
entryRuleAttributeValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAttributeValueRule()); }
	iv_ruleAttributeValue=ruleAttributeValue
	{ $current=$iv_ruleAttributeValue.current.getText(); }
	EOF;

// Rule AttributeValue
ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		(
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getAttributeValueAccess().getFullStopKeyword_2_1());
			}
			this_INT_4=RULE_INT
			{
				$current.merge(this_INT_4);
			}
			{
				newLeafNode(this_INT_4, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_2_2());
			}
		)
	)
;

// Rule AttributeType
ruleAttributeType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='range'
			{
				$current = grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getRangeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='value'
			{
				$current = grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getValueEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
