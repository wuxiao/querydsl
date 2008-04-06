/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.grammar;

import com.mysema.query.grammar.types.Expr;


/**
 * OrderSpecifier provides.
 * 
 * @param <A>  * 
 * @author tiwe
 * @version $Id$
 */
public class OrderSpecifier<A extends Comparable<A>> {
    public Order order;
    public Expr<A> target;
}