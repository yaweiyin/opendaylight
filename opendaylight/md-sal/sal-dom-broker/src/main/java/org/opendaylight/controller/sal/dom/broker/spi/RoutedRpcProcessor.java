/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.dom.broker.spi;

import java.util.Map;
import java.util.Set;

import org.opendaylight.controller.sal.core.api.Broker.RoutedRpcRegistration;
import org.opendaylight.controller.sal.core.api.RpcImplementation;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.data.api.CompositeNode;
import org.opendaylight.yangtools.yang.data.api.InstanceIdentifier;

public interface RoutedRpcProcessor extends RpcImplementation {

    public RoutedRpcRegistration addRoutedRpcImplementation(QName rpcType, RpcImplementation implementation);

    public Set<QName> getSupportedRpcs();

    public QName getRpcType();
    
    public RpcResult<CompositeNode> invokeRpc(QName rpc, CompositeNode input);

    Map<InstanceIdentifier,RpcImplementation> getRoutes();
    
    RpcImplementation getDefaultRoute();

}
