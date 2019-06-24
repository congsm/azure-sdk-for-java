// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.Service;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.CollectionFormat;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.serializer.jackson.JacksonAdapter;
import com.azure.core.util.Context;
import com.azure.storage.queue.models.ListQueuesIncludeType;
import com.azure.storage.queue.models.ServicesGetPropertiesResponse;
import com.azure.storage.queue.models.ServicesGetStatisticsResponse;
import com.azure.storage.queue.models.ServicesListQueuesSegmentResponse;
import com.azure.storage.queue.models.ServicesSetPropertiesResponse;
import com.azure.storage.queue.models.StorageErrorException;
import com.azure.storage.queue.models.StorageServiceProperties;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * Services.
 */
public final class ServicesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private ServicesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureQueueStorageImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ServicesImpl(AzureQueueStorageImpl client) {
        this.service = RestProxy.create(ServicesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Services to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    @Service("Storage Queues Services")
    private interface ServicesService {
        @PUT("")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesSetPropertiesResponse> setProperties(@HostParam("url") String url, @BodyParam("application/xml; charset=utf-8") StorageServiceProperties storageServiceProperties, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesGetStatisticsResponse> getStatistics(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @GET("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<ServicesListQueuesSegmentResponse> listQueuesSegment(@HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("include") String include, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-client-request-id") String requestId, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Sets properties for a storage account's Queue service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param storageServiceProperties The StorageService properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesSetPropertiesResponse> setPropertiesrestresponseasync(StorageServiceProperties storageServiceProperties, Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.url(), storageServiceProperties, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * Sets properties for a storage account's Queue service endpoint, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param storageServiceProperties The StorageService properties.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesSetPropertiesResponse> setPropertiesrestresponseasync(StorageServiceProperties storageServiceProperties, Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.setProperties(this.client.url(), storageServiceProperties, timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * gets the properties of a storage account's Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetPropertiesResponse> getPropertiesrestresponseasync(Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.url(), timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * gets the properties of a storage account's Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetPropertiesResponse> getPropertiesrestresponseasync(Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "properties";
        return service.getProperties(this.client.url(), timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * Retrieves statistics related to replication for the Queue service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetStatisticsResponse> getStatisticsrestresponseasync(Context context) {
        final Integer timeout = null;
        final String requestId = null;
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(this.client.url(), timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * Retrieves statistics related to replication for the Queue service. It is only available on the secondary location endpoint when read-access geo-redundant replication is enabled for the storage account.
     *
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesGetStatisticsResponse> getStatisticsrestresponseasync(Integer timeout, String requestId, Context context) {
        final String restype = "service";
        final String comp = "stats";
        return service.getStatistics(this.client.url(), timeout, this.client.version(), requestId, restype, comp, context);
    }

    /**
     * The List Queues Segment operation returns a list of the queues under the specified account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesListQueuesSegmentResponse> listQueuesSegmentrestresponseasync(Context context) {
        final String prefix = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String requestId = null;
        final String comp = "list";
        String includeConverted = null;
        return service.listQueuesSegment(this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, comp, context);
    }

    /**
     * The List Queues Segment operation returns a list of the queues under the specified account.
     *
     * @param prefix Filters the results to return only queues whose name begins with the specified prefix.
     * @param marker A string value that identifies the portion of the list of queues to be returned with the next listing operation. The operation returns the NextMarker value within the response body if the listing operation did not return all queues remaining to be listed with the current page. The NextMarker value can be used as the value for the marker parameter in a subsequent call to request the next page of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of queues to return. If the request does not specify maxresults, or specifies a value greater than 5000, the server will return up to 5000 items. Note that if the listing operation crosses a partition boundary, then the service will return a continuation token for retrieving the remainder of the results. For this reason, it is possible that the service will return fewer results than specified by maxresults, or than the default of 5000.
     * @param include Include this parameter to specify that the queues's metadata be returned as part of the response body.
     * @param timeout The The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/setting-timeouts-for-queue-service-operations&gt;Setting Timeouts for Queue Service Operations.&lt;/a&gt;.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ServicesListQueuesSegmentResponse> listQueuesSegmentrestresponseasync(String prefix, String marker, Integer maxresults, List<ListQueuesIncludeType> include, Integer timeout, String requestId, Context context) {
        final String comp = "list";
        String includeConverted = JacksonAdapter.createDefaultSerializerAdapter().serializeList(include, CollectionFormat.CSV);
        return service.listQueuesSegment(this.client.url(), prefix, marker, maxresults, includeConverted, timeout, this.client.version(), requestId, comp, context);
    }
}
