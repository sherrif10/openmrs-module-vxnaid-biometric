/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of
 * the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * OpenMRS is also distributed under the terms of the Healthcare Disclaimer located at
 * http://openmrs.org/license.
 *
 * <p>Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS graphic logo is
 * a trademark of OpenMRS Inc.
 */

package org.openmrs.module.biometric.api.contract;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.openmrs.module.biometric.api.model.SyncData;

/**
 * This class is used for response for sync templates api calls.
 */
public class SyncTemplateResponse extends SyncData {

  @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
  private String biometricsTemplate;

  public String getBiometricsTemplate() {
    return biometricsTemplate;
  }

  public void setBiometricsTemplate(String biometricsTemplate) {
    this.biometricsTemplate = biometricsTemplate;
  }
}
