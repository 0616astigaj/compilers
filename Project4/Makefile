PARSER   = MiniJava

JAVAC    = javac
JAVA     = java
JAVACC   = javacc
JJDOC    = jjdoc

JAVACC_FLAGS = -NOSTATIC -OUTPUT_DIRECTORY=Parse/ -debug_parser

JAVACCGEN = Parse/SimpleCharStream.java Parse/ParseException.java \
        Parse/$(PARSER).java Parse/$(PARSER)Constants.java \
        Parse/$(PARSER)TokenManager.java Parse/Token.java \
        Parse/TokenMgrError.java

SRCS     = Parse/$(PARSER).java Parse/Main.java

all:  $(SRCS:.java=.class)

%.class : %.java
	$(JAVAC) $<

Parse/$(PARSER).java: Parse/$(PARSER).jj
	$(JAVACC) $(JAVACC_FLAGS) $<

parser: Parse/$(PARSER).class Parse/$(PARSER)Constants.class \
	Parse/$(PARSER)TokenManager.class Parse/ParseException.class

main: $(PARSER).class Main.class

clean:
	rm -f $(SRCS:.java=.class) ${JAVACCGEN} $(JAVACCGEN:.java=.class)
