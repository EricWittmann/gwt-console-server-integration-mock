/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.bpm.console.server.plugin.mock;

import java.net.URL;
import java.util.List;

import org.jboss.bpm.console.client.model.ActiveNodeInfo;
import org.jboss.bpm.console.client.model.DiagramInfo;
import org.jboss.bpm.console.server.plugin.GraphViewerPlugin;

/**
 * GraphViewerPlugin impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class GraphViewerPluginImpl implements GraphViewerPlugin {

    /**
     * @see org.jboss.bpm.console.server.plugin.GraphViewerPlugin#getProcessImage(java.lang.String)
     */
    @Override
    public byte[] getProcessImage(String processId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.GraphViewerPlugin#getDiagramInfo(java.lang.String)
     */
    @Override
    public DiagramInfo getDiagramInfo(String processId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.GraphViewerPlugin#getActiveNodeInfo(java.lang.String)
     */
    @Override
    public List<ActiveNodeInfo> getActiveNodeInfo(String instanceId) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.GraphViewerPlugin#getDiagramURL(java.lang.String)
     */
    @Override
    public URL getDiagramURL(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.GraphViewerPlugin#getNodeInfoForActivities(java.lang.String, java.util.List)
     */
    @Override
    public List<ActiveNodeInfo> getNodeInfoForActivities(String processDefinitionId, List<String> activities) {
        // TODO Auto-generated method stub
        return null;
    }

}
