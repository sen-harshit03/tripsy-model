package com.tripsy.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PackageSearchPayload {
    private EventType eventType;
    private PackagePayload packagePayload;
    private List<String> imageUrls;
}
