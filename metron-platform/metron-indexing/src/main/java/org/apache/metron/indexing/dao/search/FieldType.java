/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.metron.indexing.dao.search;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FieldType {
  @JsonProperty("text")
  TEXT("text"),
  @JsonProperty("keyword")
  KEYWORD("keyword"),
  @JsonProperty("ip")
  IP("ip"),
  @JsonProperty("integer")
  INTEGER("integer"),
  @JsonProperty("long")
  LONG("long"),
  @JsonProperty("date")
  DATE("date"),
  @JsonProperty("float")
  FLOAT("float"),
  @JsonProperty("double")
  DOUBLE("double"),
  @JsonProperty("boolean")
  BOOLEAN("boolean"),
  @JsonProperty("nested")
  NESTED("nested"),
  @JsonProperty("other")
  OTHER("other");


  private String fieldType;

  FieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public String getFieldType() {
    return fieldType;
  }
}
