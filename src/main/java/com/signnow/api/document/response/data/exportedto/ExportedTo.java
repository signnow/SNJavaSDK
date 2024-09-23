/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.exportedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ExportedTo extends ApiData {

  @JsonProperty("export_domain")
  private final String exportDomain;

  @JsonProperty("is_exported")
  private final boolean isExported;

  @JsonProperty("exported_user_ids")
  private final ExportedUserIdCollection exportedUserIds;

  @JsonProperty("storages")
  private final StorageCollection storages;

  @JsonCreator
  public ExportedTo(
      @JsonProperty("export_domain") String exportDomain,
      @JsonProperty("is_exported") boolean isExported,
      @JsonProperty("exported_user_ids") ExportedUserIdCollection exportedUserIds,
      @JsonProperty("storages") StorageCollection storages) {
    this.exportDomain = exportDomain;
    this.isExported = isExported;
    this.exportedUserIds = exportedUserIds;
    this.storages = storages;
  }

  public String getExportDomain() {
    return this.exportDomain;
  }

  public boolean isExported() {
    return this.isExported;
  }

  public ExportedUserIdCollection getExportedUserIds() {
    return this.exportedUserIds;
  }

  public StorageCollection getStorages() {
    return this.storages;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("export_domain", this.getExportDomain());
    map.put("is_exported", this.isExported());
    map.put("exported_user_ids", this.getExportedUserIds());
    map.put("storages", this.getStorages());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static ExportedTo fromMap(@NotNull Map<String, Object> data) {
    return new ExportedTo(
        (String) data.get("export_domain"),
        (Boolean) data.get("is_exported"),
        (ExportedUserIdCollection) data.get("exported_user_ids"),
        (StorageCollection) data.get("storages"));
  }
}
