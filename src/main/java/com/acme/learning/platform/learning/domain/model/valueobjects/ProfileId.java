package com.acme.learning.platform.learning.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record ProfileId(long profileId) {
    public ProfileId(){
        this(0L);
    }
    public ProfileId{
        if (profileId<0){
            throw new IllegalArgumentException("Profile id cannot be null");
        }
    }
}
