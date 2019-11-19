/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationRecipientUsers;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.RecipientUserCollection;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationName;

class NotificationRecipientUsersImpl extends WrapperImpl<NotificationRecipientUsersInner> implements NotificationRecipientUsers {
    private final ApiManagementManager manager;

    NotificationRecipientUsersImpl(ApiManagementManager manager) {
        super(manager.inner().notificationRecipientUsers());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public RecipientUserContractImpl define(String name) {
        return wrapModel(name);
    }

    private RecipientUserContractImpl wrapModel(RecipientUserContractInner inner) {
        return  new RecipientUserContractImpl(inner, manager());
    }

    private RecipientUserContractImpl wrapModel(String name) {
        return new RecipientUserContractImpl(name, this.manager());
    }

    @Override
    public Observable<RecipientUserCollection> listByNotificationAsync(String resourceGroupName, String serviceName, NotificationName notificationName) {
        NotificationRecipientUsersInner client = this.inner();
        return client.listByNotificationAsync(resourceGroupName, serviceName, notificationName)
        .map(new Func1<RecipientUserCollectionInner, RecipientUserCollection>() {
            @Override
            public RecipientUserCollection call(RecipientUserCollectionInner inner) {
                return new RecipientUserCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable checkEntityExistsAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String userId) {
        NotificationRecipientUsersInner client = this.inner();
        return client.checkEntityExistsAsync(resourceGroupName, serviceName, notificationName, userId).toCompletable();
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String userId) {
        NotificationRecipientUsersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, notificationName, userId).toCompletable();
    }

}