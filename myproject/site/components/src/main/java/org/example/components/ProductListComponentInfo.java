package org.example.components;
/*
 * Copyright 2016-2019 BloomReach B.V. (http://www.bloomreach.com)
 * Usage is prohibited except for people attending a training given or authorised by BloomReach B.V., and only for that purpose.
 */

import org.hippoecm.hst.core.parameters.Parameter;
import org.onehippo.cms7.essentials.components.info.EssentialsListComponentInfo;

public interface ProductListComponentInfo extends EssentialsListComponentInfo{
    @Parameter(name = "isHideOutOfStock", defaultValue = "true", displayName = "Hide Out of Stock Items")
    Boolean isHideOutOfStock();
}
