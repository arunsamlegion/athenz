//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// OpenIDConfig -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenIDConfig {
    public String issuer;
    public String authorization_endpoint;
    public String jwks_uri;
    public List<String> response_types_supported;
    public List<String> subject_types_supported;
    public List<String> id_token_signing_alg_values_supported;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> claims_supported;

    public OpenIDConfig setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return issuer;
    }
    public OpenIDConfig setAuthorization_endpoint(String authorization_endpoint) {
        this.authorization_endpoint = authorization_endpoint;
        return this;
    }
    public String getAuthorization_endpoint() {
        return authorization_endpoint;
    }
    public OpenIDConfig setJwks_uri(String jwks_uri) {
        this.jwks_uri = jwks_uri;
        return this;
    }
    public String getJwks_uri() {
        return jwks_uri;
    }
    public OpenIDConfig setResponse_types_supported(List<String> response_types_supported) {
        this.response_types_supported = response_types_supported;
        return this;
    }
    public List<String> getResponse_types_supported() {
        return response_types_supported;
    }
    public OpenIDConfig setSubject_types_supported(List<String> subject_types_supported) {
        this.subject_types_supported = subject_types_supported;
        return this;
    }
    public List<String> getSubject_types_supported() {
        return subject_types_supported;
    }
    public OpenIDConfig setId_token_signing_alg_values_supported(List<String> id_token_signing_alg_values_supported) {
        this.id_token_signing_alg_values_supported = id_token_signing_alg_values_supported;
        return this;
    }
    public List<String> getId_token_signing_alg_values_supported() {
        return id_token_signing_alg_values_supported;
    }
    public OpenIDConfig setClaims_supported(List<String> claims_supported) {
        this.claims_supported = claims_supported;
        return this;
    }
    public List<String> getClaims_supported() {
        return claims_supported;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != OpenIDConfig.class) {
                return false;
            }
            OpenIDConfig a = (OpenIDConfig) another;
            if (issuer == null ? a.issuer != null : !issuer.equals(a.issuer)) {
                return false;
            }
            if (authorization_endpoint == null ? a.authorization_endpoint != null : !authorization_endpoint.equals(a.authorization_endpoint)) {
                return false;
            }
            if (jwks_uri == null ? a.jwks_uri != null : !jwks_uri.equals(a.jwks_uri)) {
                return false;
            }
            if (response_types_supported == null ? a.response_types_supported != null : !response_types_supported.equals(a.response_types_supported)) {
                return false;
            }
            if (subject_types_supported == null ? a.subject_types_supported != null : !subject_types_supported.equals(a.subject_types_supported)) {
                return false;
            }
            if (id_token_signing_alg_values_supported == null ? a.id_token_signing_alg_values_supported != null : !id_token_signing_alg_values_supported.equals(a.id_token_signing_alg_values_supported)) {
                return false;
            }
            if (claims_supported == null ? a.claims_supported != null : !claims_supported.equals(a.claims_supported)) {
                return false;
            }
        }
        return true;
    }
}
