package main.java.edu.ucsb.cs56.events_calendar;

import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull                              
import lombok.NoArgsConstructor;  // @NonNull property ignored by this constructor
import lombok.NonNull;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Event {
  @NonNull private String name;
  @NonNull private String time;
  @NonNull private String location;
}
