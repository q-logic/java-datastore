/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

public interface ListIndexesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.ListIndexesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The indexes.
   * </pre>
   *
   * <code>repeated .google.datastore.admin.v1.Index indexes = 1;</code>
   */
  java.util.List<com.google.datastore.admin.v1.Index> getIndexesList();
  /**
   *
   *
   * <pre>
   * The indexes.
   * </pre>
   *
   * <code>repeated .google.datastore.admin.v1.Index indexes = 1;</code>
   */
  com.google.datastore.admin.v1.Index getIndexes(int index);
  /**
   *
   *
   * <pre>
   * The indexes.
   * </pre>
   *
   * <code>repeated .google.datastore.admin.v1.Index indexes = 1;</code>
   */
  int getIndexesCount();
  /**
   *
   *
   * <pre>
   * The indexes.
   * </pre>
   *
   * <code>repeated .google.datastore.admin.v1.Index indexes = 1;</code>
   */
  java.util.List<? extends com.google.datastore.admin.v1.IndexOrBuilder> getIndexesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The indexes.
   * </pre>
   *
   * <code>repeated .google.datastore.admin.v1.Index indexes = 1;</code>
   */
  com.google.datastore.admin.v1.IndexOrBuilder getIndexesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
