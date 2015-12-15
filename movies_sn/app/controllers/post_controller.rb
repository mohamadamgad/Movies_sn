class PostController < ApplicationController
	
	def index
		@posts = Post.all 
	end

	def new
		@post = Post.new(:content => params[:content])
		@post.save!
	end


end
