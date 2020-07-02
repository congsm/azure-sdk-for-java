/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.AssignToAppOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.GetAssignedOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.RemoveFromAppOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ListUserLUISAccountsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.AzureAccountInfoObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AzureAccounts.
 */
public interface AzureAccounts {
    /**
     * apps - Assign a LUIS Azure account to an application.
     * Assigns an Azure account to the application.
     *
     * @param appId The application ID.
     * @param assignToAppOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus assignToApp(UUID appId, AssignToAppOptionalParameter assignToAppOptionalParameter);

    /**
     * apps - Assign a LUIS Azure account to an application.
     * Assigns an Azure account to the application.
     *
     * @param appId The application ID.
     * @param assignToAppOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> assignToAppAsync(UUID appId, AssignToAppOptionalParameter assignToAppOptionalParameter);

    /**
     * apps - Assign a LUIS Azure account to an application.
     * Assigns an Azure account to the application.
     *
     * @return the first stage of the assignToApp call
     */
    AzureAccountsAssignToAppDefinitionStages.WithAppId assignToApp();

    /**
     * Grouping of assignToApp definition stages.
     */
    interface AzureAccountsAssignToAppDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            AzureAccountsAssignToAppDefinitionStages.WithExecute withAppId(UUID appId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The custom arm token header to use; containing the user's ARM token used to validate azure accounts
             *   information.
             *
             * @return next definition stage
             */
            AzureAccountsAssignToAppDefinitionStages.WithExecute withArmToken(String armToken);

            /**
             * The Azure account information object.
             *
             * @return next definition stage
             */
            AzureAccountsAssignToAppDefinitionStages.WithExecute withAzureAccountInfoObject(AzureAccountInfoObject azureAccountInfoObject);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AzureAccountsAssignToAppDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the OperationStatus object if successful.
             */
            OperationStatus execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the OperationStatus object
             */
            Observable<OperationStatus> executeAsync();
        }
    }

    /**
     * The entirety of assignToApp definition.
     */
    interface AzureAccountsAssignToAppDefinition extends
        AzureAccountsAssignToAppDefinitionStages.WithAppId,
        AzureAccountsAssignToAppDefinitionStages.WithExecute {
    }

    /**
     * apps - Get LUIS Azure accounts assigned to the application.
     * Gets the LUIS Azure accounts assigned to the application for the user using his ARM token.
     *
     * @param appId The application ID.
     * @param getAssignedOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AzureAccountInfoObject&gt; object if successful.
     */
    List<AzureAccountInfoObject> getAssigned(UUID appId, GetAssignedOptionalParameter getAssignedOptionalParameter);

    /**
     * apps - Get LUIS Azure accounts assigned to the application.
     * Gets the LUIS Azure accounts assigned to the application for the user using his ARM token.
     *
     * @param appId The application ID.
     * @param getAssignedOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AzureAccountInfoObject&gt; object
     */
    Observable<List<AzureAccountInfoObject>> getAssignedAsync(UUID appId, GetAssignedOptionalParameter getAssignedOptionalParameter);

    /**
     * apps - Get LUIS Azure accounts assigned to the application.
     * Gets the LUIS Azure accounts assigned to the application for the user using his ARM token.
     *
     * @return the first stage of the getAssigned call
     */
    AzureAccountsGetAssignedDefinitionStages.WithAppId getAssigned();

    /**
     * Grouping of getAssigned definition stages.
     */
    interface AzureAccountsGetAssignedDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            AzureAccountsGetAssignedDefinitionStages.WithExecute withAppId(UUID appId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The custom arm token header to use; containing the user's ARM token used to validate azure accounts
             *   information.
             *
             * @return next definition stage
             */
            AzureAccountsGetAssignedDefinitionStages.WithExecute withArmToken(String armToken);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AzureAccountsGetAssignedDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;AzureAccountInfoObject&gt; object if successful.
             */
            List<AzureAccountInfoObject> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;AzureAccountInfoObject&gt; object
             */
            Observable<List<AzureAccountInfoObject>> executeAsync();
        }
    }

    /**
     * The entirety of getAssigned definition.
     */
    interface AzureAccountsGetAssignedDefinition extends
        AzureAccountsGetAssignedDefinitionStages.WithAppId,
        AzureAccountsGetAssignedDefinitionStages.WithExecute {
    }

    /**
     * apps - Removes an assigned LUIS Azure account from an application.
     * Removes assigned Azure account from the application.
     *
     * @param appId The application ID.
     * @param removeFromAppOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus removeFromApp(UUID appId, RemoveFromAppOptionalParameter removeFromAppOptionalParameter);

    /**
     * apps - Removes an assigned LUIS Azure account from an application.
     * Removes assigned Azure account from the application.
     *
     * @param appId The application ID.
     * @param removeFromAppOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> removeFromAppAsync(UUID appId, RemoveFromAppOptionalParameter removeFromAppOptionalParameter);

    /**
     * apps - Removes an assigned LUIS Azure account from an application.
     * Removes assigned Azure account from the application.
     *
     * @return the first stage of the removeFromApp call
     */
    AzureAccountsRemoveFromAppDefinitionStages.WithAppId removeFromApp();

    /**
     * Grouping of removeFromApp definition stages.
     */
    interface AzureAccountsRemoveFromAppDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            AzureAccountsRemoveFromAppDefinitionStages.WithExecute withAppId(UUID appId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The custom arm token header to use; containing the user's ARM token used to validate azure accounts
             *   information.
             *
             * @return next definition stage
             */
            AzureAccountsRemoveFromAppDefinitionStages.WithExecute withArmToken(String armToken);

            /**
             * The Azure account information object.
             *
             * @return next definition stage
             */
            AzureAccountsRemoveFromAppDefinitionStages.WithExecute withAzureAccountInfoObject(AzureAccountInfoObject azureAccountInfoObject);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AzureAccountsRemoveFromAppDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the OperationStatus object if successful.
             */
            OperationStatus execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the OperationStatus object
             */
            Observable<OperationStatus> executeAsync();
        }
    }

    /**
     * The entirety of removeFromApp definition.
     */
    interface AzureAccountsRemoveFromAppDefinition extends
        AzureAccountsRemoveFromAppDefinitionStages.WithAppId,
        AzureAccountsRemoveFromAppDefinitionStages.WithExecute {
    }

    /**
     * user - Get LUIS Azure accounts.
     * Gets the LUIS Azure accounts for the user using his ARM token.
     *
     * @param listUserLUISAccountsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AzureAccountInfoObject&gt; object if successful.
     */
    List<AzureAccountInfoObject> listUserLUISAccounts(ListUserLUISAccountsOptionalParameter listUserLUISAccountsOptionalParameter);

    /**
     * user - Get LUIS Azure accounts.
     * Gets the LUIS Azure accounts for the user using his ARM token.
     *
     * @param listUserLUISAccountsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AzureAccountInfoObject&gt; object
     */
    Observable<List<AzureAccountInfoObject>> listUserLUISAccountsAsync(ListUserLUISAccountsOptionalParameter listUserLUISAccountsOptionalParameter);

    /**
     * user - Get LUIS Azure accounts.
     * Gets the LUIS Azure accounts for the user using his ARM token.
     *
     * @return the first stage of the listUserLUISAccounts call
     */
    AzureAccountsListUserLUISAccountsDefinitionStages.WithExecute listUserLUISAccounts();

    /**
     * Grouping of listUserLUISAccounts definition stages.
     */
    interface AzureAccountsListUserLUISAccountsDefinitionStages {

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The custom arm token header to use; containing the user's ARM token used to validate azure accounts
             *   information.
             *
             * @return next definition stage
             */
            AzureAccountsListUserLUISAccountsDefinitionStages.WithExecute withArmToken(String armToken);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AzureAccountsListUserLUISAccountsDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;AzureAccountInfoObject&gt; object if successful.
             */
            List<AzureAccountInfoObject> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;AzureAccountInfoObject&gt; object
             */
            Observable<List<AzureAccountInfoObject>> executeAsync();
        }
    }

    /**
     * The entirety of listUserLUISAccounts definition.
     */
    interface AzureAccountsListUserLUISAccountsDefinition extends
        AzureAccountsListUserLUISAccountsDefinitionStages.WithExecute {
    }

}
