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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jboss.bpm.console.client.model.HistoryProcessInstanceRef;
import org.jboss.bpm.console.client.model.ProcessDefinitionRef;
import org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin;

/**
 * ProcessHistoryPlugin impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class ProcessHistoryPluginImpl implements ProcessHistoryPlugin {

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getHistoryProcessInstances(java.lang.String, java.lang.String, long, long, java.lang.String, int, int)
     */
    @Override
    public List<HistoryProcessInstanceRef> getHistoryProcessInstances(String definitionkey, String status,
            long starttime, long endtime, String correlationkey, int startpos, int maxnum) {
        return new ArrayList<HistoryProcessInstanceRef>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getProcessDefinitions()
     */
    @Override
    public List<ProcessDefinitionRef> getProcessDefinitions() {
        return DB.processDefs;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getProcessInstanceKeys(java.lang.String)
     */
    @Override
    public List<String> getProcessInstanceKeys(String definitionId) {
        return new ArrayList<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getActivityKeys(java.lang.String)
     */
    @Override
    public List<String> getActivityKeys(String instanceId) {
        return new ArrayList<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getAllEvents(java.lang.String)
     */
    @Override
    public List<String> getAllEvents(String instanceId) {
        return new ArrayList<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getCompletedInstances(java.lang.String, long, java.lang.String)
     */
    @Override
    public Set<String> getCompletedInstances(String definitionId, long timestamp, String timespan) {
        return new HashSet<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getFailedInstances(java.lang.String, long, java.lang.String)
     */
    @Override
    public Set<String> getFailedInstances(String definitionId, long timestamp, String timespan) {
        return new HashSet<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getTerminatedInstances(java.lang.String, long, java.lang.String)
     */
    @Override
    public Set<String> getTerminatedInstances(String definitionId, long timestamp, String timespan) {
        return new HashSet<String>();
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getCompletedInstances4Chart(java.lang.String, java.lang.String)
     */
    @Override
    public String getCompletedInstances4Chart(String definitionId, String timespan) {
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#getFailedInstances4Chart(java.lang.String, java.lang.String)
     */
    @Override
    public String getFailedInstances4Chart(String definitionId, String timespan) {
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessHistoryPlugin#recoveryAction(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public boolean recoveryAction(String iid, String aid, String action) {
        return false;
    }

}
