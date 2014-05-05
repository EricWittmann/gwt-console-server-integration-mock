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
import java.util.List;

import org.jboss.bpm.console.server.integration.UserManagement;

/**
 * UserManagement mock impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class UserManagementImpl implements UserManagement {

    /**
     * @see org.jboss.bpm.console.server.integration.UserManagement#getGroupsForActor(java.lang.String)
     */
    @Override
    public List<String> getGroupsForActor(String actorId) {
        List<String> groups = new ArrayList<String>();
        groups.add("manager");
        groups.add("user");
        return groups;
    }

    /**
     * @see org.jboss.bpm.console.server.integration.UserManagement#getActorsForGroup(java.lang.String)
     */
    @Override
    public List<String> getActorsForGroup(String groupName) {
        List<String> actors = new ArrayList<String>();
        actors.add("admin");
        return actors;
    }

}
