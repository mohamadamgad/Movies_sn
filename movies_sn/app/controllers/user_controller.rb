class UserController < ApplicationController

	def index
		@users = User.all
	end

	def create
		@user = User.new
	end

	def find
	 
    	@user = User.find(params[:id])
    	render json: @user.first_name if stale?(@user.first_name)
	end

	def findFriends
		@friend = Friend.where(user_email1:'m@gmail.com').take
		@myfriend = User.where(email: @friend.user_email2).take
		render json: @myfriend if stale?(@myfriend)
	end

	def editProfile
		
	end

	
end
