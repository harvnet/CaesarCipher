package com.algonquincollege.harv0116.caesarcipher;

// TODO code inspection (read and understand the code).
/**
 * Define constant variables
 * @author harv0116@algonquinlive.com
 *
 *
 *
 * The better way to define constants is to use a Java class.
 *
 * Credit: much thanks to Bo Y. for bringing this issue to my attention!
 *
 * Reference:
 *     http://stackoverflow.com/questions/2659593/what-is-the-use-of-interface-constants
 *
 * Elements borrowed from Gerald.Hurdle@AlgonquinCollege.com
 */
public class Constants {

    public static final Boolean DEBUG            = true;
    public static final String  ABOUT_DIALOG_TAG = "About";
    public static final int     ROT13            = 13;
    public static final int     ROTATION_MAX     = 26;
    public static final int     ROTATION_MIN     = 0;
    public static final String  ROTATIONS        = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String  LOG_TAG          = "CaesarCipher";
    // TODO replace "mad9132" with your AC username (e.g. bond0007)
    public static final String  THE_MESSAGE      = "com.algonquincollege.harv0116.caesercipher.message";
    // TODO replace "mad9132" with your AC username (e.g. bond007)
    public static final String  THE_ROTATION       = "com.algonquincollege.harv0116.caesercipher.rotation";

    // TODO please read.
    // Pro-tip: prevent instantiation of this class by defining a private no-arg constructor.
    //          Java will not assume the default constructor, because we've defined the no-arg
    //          constructor.
    //          Your project will NOT build if you try this:
    //              Constants constants = new Constants();
    //          Go ahead and try it for your self :)
    private Constants() { }
}
