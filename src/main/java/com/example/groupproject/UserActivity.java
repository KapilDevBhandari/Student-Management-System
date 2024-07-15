
package com.example.groupproject;

    public class UserActivity {
        private String upcomingEvents;
        private String recentActivities;
        private String participationInSport;

        public UserActivity(String upcomingEvents, String recentActivities, String participationInSport) {
            this.upcomingEvents = upcomingEvents;
            this.recentActivities = recentActivities;
            this.participationInSport = participationInSport;
        }

        public String getUpcomingEvents() {
            return upcomingEvents;
        }

        public void setUpcomingEvents(String upcomingEvents) {
            this.upcomingEvents = upcomingEvents;
        }

        public String getRecentActivities() {
            return recentActivities;
        }

        public void setRecentActivities(String recentActivities) {
            this.recentActivities = recentActivities;
        }

        public String getParticipationInSport() {
            return participationInSport;
        }

        public void setParticipationInSport(String participationInSport) {
            this.participationInSport = participationInSport;
        }
    }

