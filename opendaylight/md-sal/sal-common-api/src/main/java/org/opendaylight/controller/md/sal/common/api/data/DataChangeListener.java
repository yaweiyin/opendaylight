/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.md.sal.common.api.data;

import java.util.EventListener;

import org.opendaylight.yangtools.concepts.Path;

public interface DataChangeListener<P extends Path<P>, D> extends EventListener {

    void onDataChanged(DataChangeEvent<P, D> change);
}
