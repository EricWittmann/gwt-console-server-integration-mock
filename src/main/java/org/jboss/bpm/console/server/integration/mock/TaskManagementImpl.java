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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jboss.bpm.console.client.model.TaskRef;
import org.jboss.bpm.console.server.integration.TaskManagement;

/**
 * TaskManagement mock impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class TaskManagementImpl implements TaskManagement {

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#getTaskById(long)
     */
    @Override
    public TaskRef getTaskById(long taskId) {
        TaskRef task = new TaskRef();
        task.setId(taskId);
        task.setAssignee("admin");
        task.setBlocking(false);
        task.setCreateDate(new Date());
        task.setDescription("This is the description.");
        task.setDueDate(new Date());
        task.setName("Task Name");
        task.setPriority(3);
        task.setProcessId("1");
        task.setProcessInstanceId("1");
        task.setSignalling(false);
        return task;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#assignTask(long, java.lang.String, java.lang.String)
     */
    @Override
    public void assignTask(long taskId, String idRef, String userId) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#releaseTask(long, java.lang.String)
     */
    @Override
    public void releaseTask(long taskId, String userId) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#completeTask(long, java.util.Map, java.lang.String)
     */
    @Override
    public void completeTask(long taskId, @SuppressWarnings("rawtypes") Map data, String userId) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#completeTask(long, java.lang.String, java.util.Map, java.lang.String)
     */
    @Override
    public void completeTask(long taskId, String outcome, @SuppressWarnings("rawtypes") Map data, String userId) {
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#getAssignedTasks(java.lang.String)
     */
    @Override
    public List<TaskRef> getAssignedTasks(String idRef) {
        List<TaskRef> rval = new ArrayList<TaskRef>();
        rval.add(getTaskById(1));
        return rval;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.TaskManagement#getUnassignedTasks(java.lang.String, java.lang.String)
     */
    @Override
    public List<TaskRef> getUnassignedTasks(String idRef, String participationType) {
        List<TaskRef> rval = new ArrayList<TaskRef>();
        return rval;
    }

}
