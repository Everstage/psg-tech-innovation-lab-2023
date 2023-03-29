Language Syntax:

	1. The keyword RULES denotes the beginning of the Plan file
	2. Each rule is started with the keyword rulestart
	3. Each rule is ended with the keyword ruleend
	4. The rule is written in between these
	5. All infix expression, boolean expression, if conditions and nested if conditions are valid as a rule
	6. The keyword RULESEND denotes ending of the Plan file

Running the language:

	1. Open Terminal
 	2. Enter: DSL <nameofinputfilewithExtension>
	3. It will output json files for each rule in the input file

Dev Notes:
	compile.bat is used to compile the code if you would like to make your own changes the code in resources
	ANTLR and gson jar files are required dependencies and are included in the resources folder.