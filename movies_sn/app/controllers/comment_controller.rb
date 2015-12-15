class CommentController < ApplicationController

	def index
		@comments = Comment.all		
	end

	def create
		@comment = Comment.new 
	end
end
