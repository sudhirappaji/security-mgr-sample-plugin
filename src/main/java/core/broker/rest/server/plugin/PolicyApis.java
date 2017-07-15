/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.core.broker.rest.server.plugin;
import org.osgi.service.component.annotations.Reference;
import org.osc.manager.ism.api.IsmPolicyApi;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Component;

@Component(service = PolicyApis.class)

@Path("/xy/serverrest/v1" + "/pol")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

public class PolicyApis {

    private static final Logger logger = Logger.getLogger(PolicyApis.class);

    //@Reference
	//private IsmPolicyApi policyInfo;

   
    @GET
    public String getPolicyElement(@Context HttpHeaders headers) {

        logger.info("Listing Policies");

        return "ISMPolicies";
    }


}
