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

import java.util.List;

import org.jboss.bpm.console.client.model.DeploymentRef;
import org.jboss.bpm.console.client.model.JobRef;
import org.jboss.bpm.console.server.plugin.ProcessEnginePlugin;

/**
 * Mock impl of the process engine plugin.
 *
 * @author eric.wittmann@redhat.com
 */
public class ProcessEnginePluginImpl implements ProcessEnginePlugin {
    
    /**
     * Constructor.
     */
    public ProcessEnginePluginImpl() {
        System.out.println("[Process Engine Plugin Impl Created]");
    }
    
    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessEnginePlugin#getDeployments()
     */
    @Override
    public List<DeploymentRef> getDeployments() {
        return DB.deployments;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessEnginePlugin#deleteDeployment(java.lang.String)
     */
    @Override
    public void deleteDeployment(String id) {
        DeploymentRef found = null;
        for (DeploymentRef ref : DB.deployments) {
            if (ref.getId().equals(id)) {
                found = ref;
                break;
            }
        }
        if (found != null)
            DB.deployments.remove(found);
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessEnginePlugin#suspendDeployment(java.lang.String, boolean)
     */
    @Override
    public void suspendDeployment(String id, boolean isSuspended) {
        for (DeploymentRef ref : DB.deployments) {
            if (ref.getId().equals(id)) {
                ref.setSuspended(isSuspended);
            }
        }
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessEnginePlugin#getJobs()
     */
    @Override
    public List<JobRef> getJobs() {
        return DB.jobs;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessEnginePlugin#executeJob(java.lang.String)
     */
    @Override
    public void executeJob(String jobId) {
        // Yeah sure, we did it!
    }

}
