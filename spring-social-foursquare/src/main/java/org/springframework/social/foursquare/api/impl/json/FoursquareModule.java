package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.springframework.social.foursquare.api.Badge;
import org.springframework.social.foursquare.api.BadgeGroup;
import org.springframework.social.foursquare.api.BadgeImage;
import org.springframework.social.foursquare.api.BadgeSets;
import org.springframework.social.foursquare.api.BadgeUnlocks;
import org.springframework.social.foursquare.api.BadgesResponse;
import org.springframework.social.foursquare.api.Category;
import org.springframework.social.foursquare.api.Checkin;
import org.springframework.social.foursquare.api.CheckinInfo;
import org.springframework.social.foursquare.api.ContactInfo;
import org.springframework.social.foursquare.api.FoursquareUser;
import org.springframework.social.foursquare.api.FoursquareUserGroup;
import org.springframework.social.foursquare.api.FriendInfo;
import org.springframework.social.foursquare.api.Friends;
import org.springframework.social.foursquare.api.HereNow;
import org.springframework.social.foursquare.api.Leaderboard;
import org.springframework.social.foursquare.api.LeaderboardItem;
import org.springframework.social.foursquare.api.Location;
import org.springframework.social.foursquare.api.MayorshipInfo;
import org.springframework.social.foursquare.api.Photo;
import org.springframework.social.foursquare.api.PhotoGroup;
import org.springframework.social.foursquare.api.PhotoSize;
import org.springframework.social.foursquare.api.PhotoSizes;
import org.springframework.social.foursquare.api.PhotoSource;
import org.springframework.social.foursquare.api.Photos;
import org.springframework.social.foursquare.api.Scores;
import org.springframework.social.foursquare.api.Tip;
import org.springframework.social.foursquare.api.TipGroup;
import org.springframework.social.foursquare.api.Tips;
import org.springframework.social.foursquare.api.Todo;
import org.springframework.social.foursquare.api.Todos;
import org.springframework.social.foursquare.api.UserSearchResponse;
import org.springframework.social.foursquare.api.Venue;
import org.springframework.social.foursquare.api.VenueHistory;
import org.springframework.social.foursquare.api.VenueHistoryItem;
import org.springframework.social.foursquare.api.VenueMayor;
import org.springframework.social.foursquare.api.VenueSpecial;
import org.springframework.social.foursquare.api.VenueStats;
import org.springframework.social.foursquare.api.VenueTips;

public class FoursquareModule extends SimpleModule {

	public FoursquareModule() {
		super(FoursquareModule.class.getName(), new Version(1, 0, 0, null));
	}
	
	@Override 
	public void setupModule(SetupContext context) {
	    context.setMixInAnnotations(Badge.class, BadgeMixin.class);
	    context.setMixInAnnotations(BadgeGroup.class, BadgeGroupMixin.class);
	    context.setMixInAnnotations(BadgeImage.class, BadgeImageMixin.class);
	    context.setMixInAnnotations(BadgeSets.class, BadgeSetsMixin.class);
	    context.setMixInAnnotations(BadgesResponse.class, BadgesResponseMixin.class);
	    context.setMixInAnnotations(BadgeUnlocks.class, BadgeUnlocksMixin.class);
	    context.setMixInAnnotations(Category.class, CategoryMixin.class);
		context.setMixInAnnotations(Checkin.class, CheckinMixin.class);
		context.setMixInAnnotations(CheckinInfo.class, CheckinInfoMixin.class);
		context.setMixInAnnotations(ContactInfo.class, ContactInfoMixin.class);
		context.setMixInAnnotations(FoursquareUser.class, FoursquareUserMixin.class);
		context.setMixInAnnotations(FoursquareUserGroup.class, FoursquareUserGroupMixin.class);
		context.setMixInAnnotations(FriendInfo.class, FriendInfoMixin.class);
		context.setMixInAnnotations(Friends.class, FriendsMixin.class);
		context.setMixInAnnotations(HereNow.class, HereNowMixin.class);
		context.setMixInAnnotations(Leaderboard.class, LeaderboardMixin.class);
		context.setMixInAnnotations(LeaderboardItem.class, LeaderboardItemMixin.class);
		context.setMixInAnnotations(Location.class, LocationMixin.class);
		context.setMixInAnnotations(MayorshipInfo.class, MayorshipInfoMixin.class);
		context.setMixInAnnotations(Photo.class, PhotoMixin.class);
		context.setMixInAnnotations(Photos.class, PhotosMixin.class);
		context.setMixInAnnotations(PhotoGroup.class, PhotoGroupMixin.class);
		context.setMixInAnnotations(PhotoSize.class, PhotoSizeMixin.class);
		context.setMixInAnnotations(PhotoSizes.class, PhotoSizesMixin.class);
		context.setMixInAnnotations(PhotoSource.class, PhotoSourceMixin.class);
		context.setMixInAnnotations(Scores.class, ScoresMixin.class);
		context.setMixInAnnotations(Tip.class, TipMixin.class);
		context.setMixInAnnotations(TipGroup.class, TipGroupMixin.class);
		context.setMixInAnnotations(Tips.class, TipsMixin.class);
		context.setMixInAnnotations(Todo.class, TodoMixin.class);
		context.setMixInAnnotations(Todos.class, TodosMixin.class);
		context.setMixInAnnotations(UserSearchResponse.class, UserSearchResponseMixin.class);
		context.setMixInAnnotations(Venue.class, VenueMixin.class);
		context.setMixInAnnotations(VenueHistory.class, VenueHistoryMixin.class);
		context.setMixInAnnotations(VenueHistoryItem.class, VenueHistoryItemMixin.class);
		context.setMixInAnnotations(VenueMayor.class, VenueMayorMixin.class);
		context.setMixInAnnotations(VenueSpecial.class, VenueSpecialMixin.class);
		context.setMixInAnnotations(VenueStats.class, VenueStatsMixin.class);
		context.setMixInAnnotations(VenueTips.class, VenueTipsMixin.class);
	}
}
