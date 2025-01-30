package com.tripsy.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackagePayload {
    private Long packageId;

    private String title;

    private Double basePrice;

    private Integer durationInNights;

    private String description;

    private Long activityCount;

    private Integer accommodationCount;

    private List<ItineraryPayload> itineraries;

    private List<AccommodationPayload> accommodations;

    private List<DestinationPayload> destinations;

    private Map<String, Integer> destinationNights;
}
