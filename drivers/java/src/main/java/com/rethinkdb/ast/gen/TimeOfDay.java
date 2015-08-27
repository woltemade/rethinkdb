// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class TimeOfDay extends ReqlQuery {


    public TimeOfDay(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public TimeOfDay(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public TimeOfDay(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.TIME_OF_DAY, args, optargs);
    }
    protected TimeOfDay(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static TimeOfDay fromArgs(java.lang.Object... args){
        return new TimeOfDay(new Arguments(args), null);
    }


}