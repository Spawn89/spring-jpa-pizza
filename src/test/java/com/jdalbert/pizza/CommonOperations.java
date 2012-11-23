package com.jdalbert.pizza;

import com.ninja_squad.dbsetup.operation.Operation;

import static com.ninja_squad.dbsetup.Operations.*;

/**
 * @author jdalbert
 */

public class CommonOperations {

    public static final Operation DELETE_ALL = deleteAllFrom("pizza", "pizzaorder", "customer");

}