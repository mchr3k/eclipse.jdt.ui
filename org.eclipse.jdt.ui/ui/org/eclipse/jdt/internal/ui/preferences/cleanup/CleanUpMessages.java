/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.ui.preferences.cleanup;

import org.eclipse.osgi.util.NLS;

public class CleanUpMessages extends NLS {
	
	private static final String BUNDLE_NAME= "org.eclipse.jdt.internal.ui.preferences.cleanup.CleanUpMessages"; //$NON-NLS-1$
	
	public static String CleanUpModifyDialog_TabPageName_CodeFormating;
	public static String CleanUpModifyDialog_TabPageName_CodeStyle;
	public static String CleanUpModifyDialog_TabPageName_MemberAccesses;
	public static String CleanUpModifyDialog_TabPageName_MissingCode;
	public static String CleanUpModifyDialog_TabPageName_UnnecessaryCode;
	
	public static String CleanUpProfileManager_ProfileName_EclipseBuildIn;

	public static String CodeFormatingTabPage_CheckboxName_FormatComments;
	public static String CodeFormatingTabPage_CheckboxName_FormatJavadocComments;
	public static String CodeFormatingTabPage_CheckboxName_FormatMultiLineComments;
	public static String CodeFormatingTabPage_CheckboxName_FormatSingleLineComments;
	public static String CodeFormatingTabPage_CheckboxName_FormatSourceCode;
	public static String CodeFormatingTabPage_GroupName_Formatter;

	public static String CodeStyleTabPage_CheckboxName_ConvertForLoopToEnhanced;
	public static String CodeStyleTabPage_CheckboxName_UseBlocks;
	public static String CodeStyleTabPage_CheckboxName_UseFinal;
	public static String CodeStyleTabPage_CheckboxName_UseFinalForFields;
	public static String CodeStyleTabPage_CheckboxName_UseFinalForLocals;
	public static String CodeStyleTabPage_CheckboxName_UseFinalForParameters;
	public static String CodeStyleTabPage_CheckboxName_UseParentheses;
	public static String CodeStyleTabPage_GroupName_ControlStatments;
	public static String CodeStyleTabPage_GroupName_Expressions;
	public static String CodeStyleTabPage_GroupName_VariableDeclarations;
	public static String CodeStyleTabPage_RadioName_AlwaysUseBlocks;
	public static String CodeStyleTabPage_RadioName_AlwaysUseParantheses;
	public static String CodeStyleTabPage_RadioName_NeverUseBlocks;
	public static String CodeStyleTabPage_RadioName_NeverUseParantheses;
	public static String CodeStyleTabPage_RadioName_UseBlocksSpecial;

	public static String MemberAccessesTabPage_CheckboxName_ChangeAccessesThroughInstances;
	public static String MemberAccessesTabPage_CheckboxName_ChangeAccessesThroughSubtypes;
	public static String MemberAccessesTabPage_CheckboxName_FieldQualifier;
	public static String MemberAccessesTabPage_CheckboxName_MethodQualifier;
	public static String MemberAccessesTabPage_CheckboxName_QualifyFieldWithDeclaringClass;
	public static String MemberAccessesTabPage_CheckboxName_QualifyMethodWithDeclaringClass;
	public static String MemberAccessesTabPage_CheckboxName_QualifyWithDeclaringClass;
	public static String MemberAccessesTabPage_GroupName_NonStaticAccesses;
	public static String MemberAccessesTabPage_GroupName_StaticAccesses;
	public static String MemberAccessesTabPage_RadioName_AlwaysThisForFields;
	public static String MemberAccessesTabPage_RadioName_AlwaysThisForMethods;
	public static String MemberAccessesTabPage_RadioName_NeverThisForFields;
	public static String MemberAccessesTabPage_RadioName_NeverThisForMethods;

	public static String MissingCodeTabPage_CheckboxName_AddMissingAnnotations;
	public static String MissingCodeTabPage_CheckboxName_AddMissingDeprecatedAnnotations;
	public static String MissingCodeTabPage_CheckboxName_AddMissingOverrideAnnotations;
	public static String MissingCodeTabPage_CheckboxName_AddSUID;
	public static String MissingCodeTabPage_GroupName_Annotations;
	public static String MissingCodeTabPage_GroupName_PotentialProgrammingProblems;
	public static String MissingCodeTabPage_RadioName_AddDefaultSUID;
	public static String MissingCodeTabPage_RadioName_AddGeneratedSUID;

	public static String UnnecessaryCodeTabPage_CheckboxName_UnnecessaryCasts;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnnecessaryNLSTags;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedConstructors;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedFields;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedImports;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedLocalVariables;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedMembers;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedMethods;
	public static String UnnecessaryCodeTabPage_CheckboxName_UnusedTypes;
	public static String UnnecessaryCodeTabPage_GroupName_UnnecessaryCode;
	public static String UnnecessaryCodeTabPage_GroupName_UnusedCode;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, CleanUpMessages.class);
	}

	private CleanUpMessages() {
	}
}