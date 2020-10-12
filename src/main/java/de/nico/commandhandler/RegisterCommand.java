package de.nico.commandhandler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RegisterCommand
{
    String[] aliases();

    String description() default "";
    String usage() default "";

    boolean directMessage() default false;
    boolean channelMessage() default true;
    boolean allowSelf() default false;
    boolean allowOthers() default true;
    boolean showInHelp() default true;
}
