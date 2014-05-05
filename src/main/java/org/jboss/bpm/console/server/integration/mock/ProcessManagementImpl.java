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

package org.jboss.bpm.console.server.integration.mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.bpm.console.client.model.ProcessDefinitionRef;
import org.jboss.bpm.console.client.model.ProcessInstanceRef;
import org.jboss.bpm.console.client.model.ProcessInstanceRef.RESULT;
import org.jboss.bpm.console.client.model.ProcessInstanceRef.STATE;
import org.jboss.bpm.console.server.integration.ProcessManagement;
import org.jboss.bpm.console.server.plugin.mock.DB;

/**
 * ProcessManagement mock impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class ProcessManagementImpl implements ProcessManagement {

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#getProcessDefinitions()
     */
    @Override
    public List<ProcessDefinitionRef> getProcessDefinitions() {
        return DB.processDefs;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#getProcessDefinition(java.lang.String)
     */
    @Override
    public ProcessDefinitionRef getProcessDefinition(String definitionId) {
        return DB.processDefs.get(0);
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#removeProcessDefinition(java.lang.String)
     */
    @Override
    public List<ProcessDefinitionRef> removeProcessDefinition(String definitionId) {
        return DB.processDefs;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#getProcessInstances(java.lang.String)
     */
    @Override
    public List<ProcessInstanceRef> getProcessInstances(String definitionId) {
        return DB.processes;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#getProcessInstance(java.lang.String)
     */
    @Override
    public ProcessInstanceRef getProcessInstance(String instanceId) {
        return DB.processes.get(0);
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#newInstance(java.lang.String)
     */
    @Override
    public ProcessInstanceRef newInstance(String defintionId) {
        return DB.processes.get(0);
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#newInstance(java.lang.String, java.util.Map)
     */
    @Override
    public ProcessInstanceRef newInstance(String definitionId, Map<String, Object> processVars) {
        return DB.processes.get(0);
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#getInstanceData(java.lang.String)
     */
    @Override
    public Map<String, Object> getInstanceData(String instanceId) {
        Map<String, Object> data = new HashMap<String, Object>();
        return data;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#setInstanceData(java.lang.String, java.util.Map)
     */
    @Override
    public void setInstanceData(String instanceId, Map<String, Object> data) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#endInstance(java.lang.String, org.jboss.bpm.console.client.model.ProcessInstanceRef.RESULT)
     */
    @Override
    public void endInstance(String instanceId, RESULT result) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#deleteInstance(java.lang.String)
     */
    @Override
    public void deleteInstance(String instanceId) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#setProcessState(java.lang.String, org.jboss.bpm.console.client.model.ProcessInstanceRef.STATE)
     */
    @Override
    public void setProcessState(String instanceId, STATE nextState) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#signalExecution(java.lang.String, java.lang.String)
     */
    @Override
    public void signalExecution(String executionId, String signal) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.ProcessManagement#deleteInstances(java.lang.String)
     */
    @Override
    public long deleteInstances(String filter) {
        return 0;
    }

}
