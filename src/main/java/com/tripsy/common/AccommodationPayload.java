package com.tripsy.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccommodationPayload {
    private Long accommodationId;

    private String hotelName;

    private int nights;
}
