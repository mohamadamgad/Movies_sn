class FriendController < ApplicationController

	def index
		@friends = Friend.all
	end

	def create 
		@friend = Friend.new  
	end



end
