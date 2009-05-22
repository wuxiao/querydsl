/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.types.operation;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.util.List;

import com.mysema.query.types.expr.ENumber;
import com.mysema.query.types.expr.Expr;
import com.mysema.query.types.operation.Ops.Op;

public class ONumber<OpType extends Number, D extends Number & Comparable<?>>
		extends ENumber<D> implements Operation<OpType, D> {
	private final List<Expr<?>> args;
	private final Op<OpType> op;

	public ONumber(Class<? extends D> type, Op<OpType> op, Expr<?>... args) {
		this(type, op, asList(args));
	}

	public ONumber(Class<? extends D> type, Op<OpType> op, List<Expr<?>> args) {
		super(type);
		this.op = op;
		this.args = unmodifiableList(args);
		validate();
	}

	public List<Expr<?>> getArgs() {
		return args;
	}

	public Expr<?> getArg(int i) {
		return args.get(i);
	}

	public Op<OpType> getOperator() {
		return op;
	}
}