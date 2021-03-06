package com.github.arara.utils;

// needed imports
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * Contains all the constants used in the main application.
 *
 * @since 3.0
 * @author Paulo Roberto Massa Cereda
 * @version 4.0
 */
public class AraraConstants {
    
    /**
     * The arara version.
     */
    public static final String VERSION = "4.0RC3";
    /**
     * The number of characters per line in messages.
     */
    public static final int WRAPLENGTH = 65;
    /**
     * The name of the default configuration file.
     */
    public static final String ARARACONFIG = "araraconfig.yaml";
    /**
     * The directive prefix for the pattern matching method.
     */
    public static final String DIRECTIVEPREFIX = "arara:\\s";
    /**
     * The rule pattern for string reference.
     */
    public static final String RULEPATTERN = "^(\\s)*<arara>\\s";
    /**
     * The name of the log file generated by arara.
     */
    public static final String LOGNAME = "arara";
    /**
     * The copyright year.
     */
    public static final String COPYRIGHTYEAR = "2012";
    /**
     * The variable exception matching pattern.
     */
    public static final String VAREXCEPTIONPATTERN = "^\\[Error: could not access: (.*);";
    /**
     * The method exception matching pattern.
     */
    public static final String METHODEXCEPTIONPATTERN = "^\\[Error: unable to access property \\((.*)\\): (.*)\\]";
    /**
     * The full directive matching pattern.
     */
    public static final String FULLDIRECTIVEPATTERN = "^\\s*(\\w+)\\s*:\\s*(\\{.*\\})\\s*$";
    /**
     * The empty directive matching pattern.
     */
    public static final String EMPTYDIRECTIVEPATTERN = "^\\s*(\\w+)\\s*$";
    /**
     * The full directive matching pattern, with support for conditionals.
     */
    public static final String FULLDIRECTIVECONDITIONALPATTERN = "^\\s*(\\w+)\\s*:\\s*(\\{.*\\})\\s+(if|while|until)\\s+(\\S.*)$";
    /**
     * The empty directive matching pattern, with support for conditionals.
     */
    public static final String EMPTYDIRECTIVECONDITIONALPATTERN = "^\\s*(\\w+)\\s+(if|while|until)\\s+(\\S.*)$";
    /**
     * The matching pattern for arara triggers.
     */
    public static final String ARARATRIGGER = "^\\s*arara\\s+(\\w+)\\s*(\\S.*){0,1}$";
    /**
     * The database name.
     */
    public static final String ARARADATABASE = "arara.xml";
    /**
     * The hash function used in the evaluation phase.
     */
    public static final HashFunction HASHFUNCTION = Hashing.crc32();
    /**
     * The default value for the maximum number of loops per conditional.
     */
    public static final long MAXLOOPS = 10;
}
