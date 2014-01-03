/*
* generated by Xtext
*/
package org.search.niem.uml.papyrus.textedit.property.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.search.niem.uml.papyrus.textedit.property.xtext.services.NIEMUmlPropertyGrammarAccess;

public class NIEMUmlPropertyParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private NIEMUmlPropertyGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.search.niem.uml.papyrus.textedit.property.xtext.parser.antlr.internal.InternalNIEMUmlPropertyParser createParser(XtextTokenStream stream) {
		return new org.search.niem.uml.papyrus.textedit.property.xtext.parser.antlr.internal.InternalNIEMUmlPropertyParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PropertyRule";
	}
	
	public NIEMUmlPropertyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(NIEMUmlPropertyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}