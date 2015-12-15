class PostController < ApplicationController
	
	def index
		@posts = Post.all 
	end

	def create
		@post = Post.new 
	end
end
