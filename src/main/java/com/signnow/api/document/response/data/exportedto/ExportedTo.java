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

/**
 * This class represents the exported data to a specific domain.
 */
public final class ExportedTo extends ApiData {

  /**
   * The domain where the data is exported.
   */
  @JsonProperty("export_domain")
  private final String exportDomain;

  /**
   * Flag indicating whether the data is exported or not.
   */
  @JsonProperty("is_exported")
  private final boolean isExported;

  /**
   * Collection of user IDs to which the data is exported.
   */
  @JsonProperty("exported_user_ids")
  private final ExportedUserIdCollection exportedUserIds;

  /**
   * Collection of storages where the data is exported.
   */
  @JsonProperty("storages")
  private final StorageCollection storages;

  /**
   * Constructor for the ExportedTo class.
   *
   * @param exportDomain The domain where the data is exported.
   * @param isExported Flag indicating whether the data is exported or not.
   * @param exportedUserIds Collection of user IDs to which the data is exported.
   * @param storages Collection of storages where the data is exported.
   */
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

  /**
   * Returns the domain where the data is exported.
   *
   * @return The export domain.
   */
  public String getExportDomain() {
    return this.exportDomain;
  }

  /**
   * Returns whether the data is exported or not.
   *
   * @return True if the data is exported, false otherwise.
   */
  public boolean isExported() {
    return this.isExported;
  }

  /**
   * Returns the collection of user IDs to which the data is exported.
   *
   * @return The collection of exported user IDs.
   */
  public ExportedUserIdCollection getExportedUserIds() {
    return this.exportedUserIds;
  }

  /**
   * Returns the collection of storages where the data is exported.
   *
   * @return The collection of storages.
   */
  public StorageCollection getStorages() {
    return this.storages;
  }

  /**
   * Converts the exported data to a map.
   *
   * @return A map representing the exported data.
   */
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

  /**
   * Creates an instance of ExportedTo from a map.
   *
   * @param data A map representing the exported data.
   * @return An instance of ExportedTo.
   */
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