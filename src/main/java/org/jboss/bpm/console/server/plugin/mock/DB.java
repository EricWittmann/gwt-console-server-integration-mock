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
import java.util.Date;
import java.util.List;

import org.jboss.bpm.console.client.model.DeploymentRef;
import org.jboss.bpm.console.client.model.JobRef;
import org.jboss.bpm.console.client.model.ProcessDefinitionRef;
import org.jboss.bpm.console.client.model.ProcessInstanceRef;

/**
 * The mock database.
 *
 * @author eric.wittmann@redhat.com
 */
public class DB {

    public static List<DeploymentRef> deployments = new ArrayList<DeploymentRef>();
    public static List<JobRef> jobs = new ArrayList<JobRef>();
    public static List<ProcessDefinitionRef> processDefs = new ArrayList<ProcessDefinitionRef>();
    public static List<ProcessInstanceRef> processes = new ArrayList<ProcessInstanceRef>();

    static {
        DeploymentRef dref = new DeploymentRef("dr-1", true);
        dref.setName("Deployment Ref 1");
        dref.setTimestamp(System.currentTimeMillis());
        deployments.add(dref);
        dref = new DeploymentRef("dr-2", true);
        dref.setName("Deployment Ref 2");
        dref.setTimestamp(System.currentTimeMillis());
        deployments.add(dref);
        
        JobRef jref = new JobRef("jr-1", System.currentTimeMillis(), "foo");
        jref.setError("Error");
        jref.setErrMsg("This is the error message");
        jobs.add(jref);
        
        ProcessDefinitionRef pref = new ProcessDefinitionRef("pr-1", "Process Definition 1", 1);
        pref.setName("Process Definition 1");
        pref.setDeploymentId("dr-1");
        pref.setDescription("This is the description of the process definition (1).");
        pref.setKey("key1");
        pref.setPackageName("process-defs");
        processDefs.add(pref);
        pref = new ProcessDefinitionRef("pr-1", "Process Definition 2", 1);
        pref.setName("Process Definition 2");
        pref.setDeploymentId("dr-2");
        pref.setDescription("This is the description of the process definition (2).");
        pref.setKey("key2");
        pref.setPackageName("process-defs");
        processDefs.add(pref);
        
        ProcessInstanceRef pir = new ProcessInstanceRef();
        pir.setDefinitionId("pr-1");
        pir.setEndDate(new Date());
        pir.setId("pir-1");
        pir.setKey("pir-key");
        pir.setSuspended(false);
        processes.add(pir);
    }

}
